package gestion.immo.microservicelogement.service;

import gestion.immo.microservicelogement.model.Cite;

import java.util.List;

public interface CiteService {
    Cite saveCite(Cite cite);
    Cite updateCite(Cite cite);
    Cite findCite(Long idCite);
    List<Cite> findAll();
    void deleteCite(Long id);
}
