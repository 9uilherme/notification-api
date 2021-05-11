package guidev.factory.repositories;

import guidev.factory.models.Whatsapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WhatsappRepository extends JpaRepository<Whatsapp, Long> {

    @Query("from Whatsapp wht " +
            "where wht.id = :id")
    Optional<Whatsapp> findById(Long id);

    @Query("from Whatsapp wht " +
            "where wht.id in (:ids)")
    List<Whatsapp> findByIds(List<Long> ids);

}
