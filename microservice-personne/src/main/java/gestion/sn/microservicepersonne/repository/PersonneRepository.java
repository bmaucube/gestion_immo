package gestion.sn.microservicepersonne.repository;

import gestion.sn.microservicepersonne.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
