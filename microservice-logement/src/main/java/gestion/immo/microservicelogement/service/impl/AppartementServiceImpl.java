package gestion.immo.microservicelogement.service.impl;

import gestion.immo.microservicelogement.dto.AppartementDTO;
import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.model.Immeuble;
import gestion.immo.microservicelogement.repository.AppartementRepository;
import gestion.immo.microservicelogement.service.AppartementService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppartementServiceImpl implements AppartementService {
    private final AppartementRepository repository;
    private final ModelMapper modelMapper;
    @Override
    public AppartementDTO saveAppartement(AppartementDTO dto) {
        return fromEntity(repository.save(toEntity(dto)));
    }

    @Override
    public AppartementDTO updateAppartement(AppartementDTO dto) {
        return fromEntity(repository.save(toEntity(dto)));
    }

    @Override
    public AppartementDTO findAppartement(Long idAppartement) {
        return fromEntity(repository.findById(idAppartement).orElseThrow());
    }

    @Override
    public List<AppartementDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAppartement(Long idAppartement) {
        repository.deleteById(idAppartement);
    }

    @Override
    public AppartementDTO fromEntity(Appartement appartement) {
        return modelMapper.map(appartement, AppartementDTO.class);
    }

    @Override
    public Appartement toEntity(AppartementDTO dto) {
        return modelMapper.map(dto, Appartement.class);
    }
}
