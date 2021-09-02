package guidev.factory.repositories;

import guidev.factory.models.WhatsappConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WhatsappRepository extends JpaRepository<WhatsappConfig, Long> {

    @Query("from WhatsappConfig wht " +
            "where wht.id = :id")
    Optional<WhatsappConfig> findById(Long id);

    @Query("from WhatsappConfig wht " +
            "where wht.id in (:ids)")
    List<WhatsappConfig> findByIds(List<Long> ids);

}
