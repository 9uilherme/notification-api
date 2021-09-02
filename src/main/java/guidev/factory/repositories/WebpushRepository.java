package guidev.factory.repositories;

import guidev.factory.models.WebpushConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WebpushRepository extends JpaRepository<WebpushConfig, Long> {

    @Query("from WebpushConfig web " +
            "where web.id = :id")
    Optional<WebpushConfig> findById(Long id);

    @Query("from WebpushConfig web " +
            "where web.id in (:ids)")
    List<WebpushConfig> findByIds(List<Long> ids);

}
