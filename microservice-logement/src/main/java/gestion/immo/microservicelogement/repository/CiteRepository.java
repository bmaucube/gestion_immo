package gestion.immo.microservicelogement.repository;

import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.model.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CiteRepository extends JpaRepository<Cite,Long> {
}
