package gestion.immo.microservicelogement.service.impl;

import gestion.immo.microservicelogement.dto.ImmeubleDTO;
import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.model.Immeuble;
import gestion.immo.microservicelogement.repository.AppartementRepository;
import gestion.immo.microservicelogement.repository.CiteRepository;
import gestion.immo.microservicelogement.repository.ImmeubleRepository;
import gestion.immo.microservicelogement.service.ImmeubleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ImmeubleServiceImpl implements ImmeubleService {
    private final ImmeubleRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public ImmeubleDTO saveImmeuble(ImmeubleDTO immeubleDTO) {
        return fromEntity(repository.save(toEntity(immeubleDTO)));
    }

    @Override
    public ImmeubleDTO updateImmeuble(ImmeubleDTO immeubleDTO) {
        return fromEntity(repository.save(toEntity(immeubleDTO)));
    }

    @Override
    public ImmeubleDTO findImmeuble(Long idImmeuble) {
        return fromEntity(repository.findById(idImmeuble).get());
    }

    @Override
    public List<ImmeubleDTO> findAll() {
        return repository.findAll().stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteImmeuble(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ImmeubleDTO fromEntity(Immeuble immeuble) {
        return modelMapper.map(immeuble, ImmeubleDTO.class);
    }

    @Override
    public Immeuble toEntity(ImmeubleDTO immeubleDTO) {
        return modelMapper.map(immeubleDTO, Immeuble.class);
    }
}
