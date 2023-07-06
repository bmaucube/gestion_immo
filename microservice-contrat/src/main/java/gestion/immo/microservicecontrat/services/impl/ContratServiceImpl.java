package gestion.immo.microservicecontrat.services.impl;

import gestion.immo.microservicecontrat.dto.ContratDTO;
import gestion.immo.microservicecontrat.models.Contrat;
import gestion.immo.microservicecontrat.repository.ContratRepository;
import gestion.immo.microservicecontrat.services.ContratService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements ContratService {
    private final ContratRepository repository;
    private final ModelMapper modelMapper;
    @Override
    public ContratDTO createContrat(ContratDTO contratDTO) {
        return fromEntity(repository.save(toEntity(contratDTO)));
    }

    @Override
    public ContratDTO updateContrat(ContratDTO contratDTO) {
        return fromEntity(repository.save(toEntity(contratDTO)));
    }

    @Override
    public ContratDTO findContrat(Long numContrat) {
        return fromEntity(repository.findById(numContrat).get());
    }

    @Override
    public List<ContratDTO> findAllContrats() {
        return repository.findAll().stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteContrat(Long numContrat) {
        repository.deleteById(numContrat);
    }

    @Override
    public ContratDTO fromEntity(Contrat contrat) {
        return modelMapper.map(contrat, ContratDTO.class);
    }

    @Override
    public Contrat toEntity(ContratDTO contratDTO) {
       return modelMapper.map(contratDTO, Contrat.class);
    }
}
