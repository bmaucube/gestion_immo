package gestion.immo.microservicecontrat.repository;

import gestion.immo.microservicecontrat.models.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
