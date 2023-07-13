package gestion.immo.microservicelogement.service.impl;

import gestion.immo.microservicelogement.dto.CiteDTO;
import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.repository.CiteRepository;
import gestion.immo.microservicelogement.repository.ImmeubleRepository;
import gestion.immo.microservicelogement.service.CiteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CiteServiceImpl implements CiteService {
    private final CiteRepository repository;
    private final ModelMapper modelMapper;
    private final ImmeubleRepository immeubleRepository;
    @Override
    public CiteDTO saveCite(CiteDTO dto) {
        return fromEntity(repository.save(toEntity(dto)));
    }

    @Override
    public CiteDTO updateCite(CiteDTO dto) {
       return fromEntity(repository.save(toEntity(dto)));
    }

    @Override
    public CiteDTO findCite(Long idCite) {
        return fromEntity(repository.findById(idCite).orElseThrow());
    }

    @Override
    public List<CiteDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCite(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CiteDTO fromEntity(Cite cite) {
        return modelMapper.map(cite,CiteDTO.class);
    }

    @Override
    public Cite toEntity(CiteDTO dto) {
        return modelMapper.map(dto, Cite.class);
    }
}
