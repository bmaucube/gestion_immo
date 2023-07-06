package gestion.immo.microservicelogement.service.impl;

import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.model.Immeuble;
import gestion.immo.microservicelogement.repository.AppartementRepository;
import gestion.immo.microservicelogement.service.AppartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppartementServiceImpl implements AppartementService {
    private final AppartementRepository repository;
    @Override
    public Appartement saveAppartement(Appartement appartement) {
        return repository.save(appartement);
    }

    @Override
    public Appartement updateAppartement(Appartement appartement) {
        Appartement ap = findAppartement(appartement.getNum());
        return Appartement.builder()
                .immeuble(ap.getImmeuble())
                .nbChambre(ap.getNbChambre())
                .build();
    }

    @Override
    public Appartement findAppartement(Long idAppartement) {
        return repository.findById(idAppartement).orElseThrow();
    }

    @Override
    public List<Appartement> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteAppartement(Long idAppartement) {
        repository.deleteById(idAppartement);
    }
}
