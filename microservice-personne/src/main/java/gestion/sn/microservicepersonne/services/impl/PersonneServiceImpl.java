package gestion.sn.microservicepersonne.services.impl;

import gestion.sn.microservicepersonne.models.Personne;
import gestion.sn.microservicepersonne.repository.PersonneRepository;
import gestion.sn.microservicepersonne.services.PersonneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonneServiceImpl implements PersonneService {
    private final PersonneRepository repository;
    @Override
    public Personne addPersonne(Personne personne) {
        return repository.save(personne);
    }

    @Override
    public Personne updatePersonne(Personne personne) {
        return repository.save(personne);
    }

    @Override
    public List<Personne> getAllPersonnes() {
        return repository.findAll();
    }

    @Override
    public Personne getPersonne(Long idpers) {
        return repository.findById(idpers).orElseThrow();
    }

    @Override
    public void deletePersonne(Long idPerson) {
        repository.deleteById(idPerson);
    }
}
