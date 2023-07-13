package gestion.immo.microservicelogement.service;

import gestion.immo.microservicelogement.dto.CiteDTO;
import gestion.immo.microservicelogement.dto.ImmeubleDTO;
import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.model.Immeuble;

import java.util.List;

public interface CiteService {
    CiteDTO saveCite(CiteDTO dto);
    CiteDTO updateCite(CiteDTO dto);
    CiteDTO findCite(Long idCite);
    List<CiteDTO> findAll();
    void deleteCite(Long id);

    CiteDTO fromEntity(Cite cite);
    Cite toEntity(CiteDTO dto);
}
