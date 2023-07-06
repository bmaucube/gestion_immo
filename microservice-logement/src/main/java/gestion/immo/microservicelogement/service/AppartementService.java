package gestion.immo.microservicelogement.service;

import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.model.Cite;

import java.util.List;

public interface AppartementService {
    Appartement saveAppartement(Appartement appartement);
    Appartement updateAppartement(Appartement appartement);
    Appartement findAppartement(Long idAppartement);
    List<Appartement> findAll();
    void deleteAppartement(Long idAppartement);


}
