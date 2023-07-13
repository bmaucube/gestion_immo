package gestion.immo.microservicelogement.service;

import gestion.immo.microservicelogement.dto.AppartementDTO;
import gestion.immo.microservicelogement.dto.CiteDTO;
import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.model.Cite;

import java.util.List;

public interface AppartementService {
    AppartementDTO saveAppartement(AppartementDTO dto);
    AppartementDTO updateAppartement(AppartementDTO dto);
    AppartementDTO findAppartement(Long idAppartement);
    List<AppartementDTO> findAll();
    void deleteAppartement(Long idAppartement);

    AppartementDTO fromEntity(Appartement appartement);
    Appartement toEntity(AppartementDTO dto);
}
