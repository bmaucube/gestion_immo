package gestion.immo.microservicecontrat.services;

import gestion.immo.microservicecontrat.dto.ContratDTO;
import gestion.immo.microservicecontrat.models.Contrat;

import java.util.List;

public interface ContratService {
    ContratDTO createContrat(ContratDTO contratDTO);
    ContratDTO updateContrat(ContratDTO contratDTO);
    ContratDTO findContrat(Long numContrat);
    List<ContratDTO> findAllContrats();
    void deleteContrat(Long id);

    ContratDTO fromEntity(Contrat contrat);
    Contrat toEntity(ContratDTO contratDTO);
    /**
     * POUR COMMUNIQUER AVEC LES MICROSERVICES
     * **/
    //TODO
}
