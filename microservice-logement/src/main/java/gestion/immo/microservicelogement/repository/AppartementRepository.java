package gestion.immo.microservicelogement.repository;

import gestion.immo.microservicelogement.model.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppartementRepository extends JpaRepository<Appartement,Long> {
    List<Appartement> findAllByImmeuble(Long idImmeuble);
}
