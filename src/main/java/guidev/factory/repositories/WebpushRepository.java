package guidev.factory.repositories;

import guidev.factory.models.Webpush;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WebpushRepository extends JpaRepository<Webpush, Long> {

    @Query("from Webpush web " +
            "where web.id = :id")
    Optional<Webpush> findById(Long id);

    @Query("from Webpush web " +
            "where web.id in (:ids)")
    List<Webpush> findByIds(List<Long> ids);

}
