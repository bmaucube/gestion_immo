package gestion.sn.microservicepersonne.services.impl;

import gestion.sn.microservicepersonne.dto.PersonneDTO;
import gestion.sn.microservicepersonne.models.Personne;
import gestion.sn.microservicepersonne.repository.PersonneRepository;
import gestion.sn.microservicepersonne.services.PersonneService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonneServiceImpl implements PersonneService {
    private final PersonneRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public PersonneDTO addPersonne(PersonneDTO dto) {
        return fromEntity(repository.save(toEntity(dto)));
    }

    @Override
    public PersonneDTO updatePersonne(PersonneDTO dto) {
        return fromEntity(repository.save(toEntity(dto)));
    }

    @Override
    public List<PersonneDTO> getAllPersonnes() {
        return repository.findAll().stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public PersonneDTO getPersonne(Long idpers) {
        return fromEntity(repository.findById(idpers).orElseThrow());
    }

    @Override
    public void deletePersonne(Long idPerson) {
        repository.deleteById(idPerson);
    }

    @Override
    public PersonneDTO fromEntity(Personne personne) {
        return modelMapper.map(personne, PersonneDTO.class);
    }

    @Override
    public Personne toEntity(PersonneDTO personneDTO) {
        return modelMapper.map(personneDTO, Personne.class);
    }
}
