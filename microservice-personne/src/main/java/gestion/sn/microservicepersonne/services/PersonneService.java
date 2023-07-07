package gestion.sn.microservicepersonne.services;

import gestion.sn.microservicepersonne.models.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {
    Personne addPersonne(Personne personne);
    Personne updatePersonne(Personne personne);
    List<Personne> getAllPersonnes();

    Personne getPersonne(Long idpers);
    void deletePersonne(Long idPerson);
}
