package gestion.sn.microservicepersonne.services;

import gestion.sn.microservicepersonne.dto.PersonneDTO;
import gestion.sn.microservicepersonne.models.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {
    PersonneDTO addPersonne(PersonneDTO dto);
    PersonneDTO updatePersonne(PersonneDTO dto);
    List<PersonneDTO> getAllPersonnes();

    PersonneDTO getPersonne(Long idpers);
    void deletePersonne(Long idPerson);

    PersonneDTO fromEntity(Personne personne);
    Personne toEntity(PersonneDTO personneDTO);
}
