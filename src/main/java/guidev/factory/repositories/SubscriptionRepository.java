package guidev.factory.repositories;

import guidev.factory.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    @Query("SELECT sub FROM Subscription sub " +
            "join fetch sub.channelConfig")
    List<Subscription> getAll();

}
