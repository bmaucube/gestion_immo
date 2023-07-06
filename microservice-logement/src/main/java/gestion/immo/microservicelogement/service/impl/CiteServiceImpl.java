package gestion.immo.microservicelogement.service.impl;

import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.repository.CiteRepository;
import gestion.immo.microservicelogement.repository.ImmeubleRepository;
import gestion.immo.microservicelogement.service.CiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CiteServiceImpl implements CiteService {
    private final CiteRepository repository;
    private final ImmeubleRepository immeubleRepository;
    @Override
    public Cite saveCite(Cite cite) {
        return repository.save(cite);
    }

    @Override
    public Cite updateCite(Cite cite) {
        Cite c1 = findCite(cite.getId());
        return Cite.builder()
                .nom(c1.getNom())
                .immeubles(c1.getImmeubles())
                .build();
    }

    @Override
    public Cite findCite(Long idCite) {
        return repository.findById(idCite).orElseThrow();
    }

    @Override
    public List<Cite> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteCite(Long id) {
        repository.deleteById(id);
    }
}
