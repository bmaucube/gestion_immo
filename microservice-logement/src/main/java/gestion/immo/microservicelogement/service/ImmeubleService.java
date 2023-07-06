package gestion.immo.microservicelogement.service;

import gestion.immo.microservicelogement.dto.ImmeubleDTO;
import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.model.Immeuble;

import java.util.List;

public interface ImmeubleService {
    ImmeubleDTO saveImmeuble(ImmeubleDTO immeuble);
    ImmeubleDTO updateImmeuble(ImmeubleDTO immeuble);
    ImmeubleDTO findImmeuble(Long idImmeuble);
    List<ImmeubleDTO> findAll();
    void deleteImmeuble(Long id);

    ImmeubleDTO fromEntity(Immeuble immeuble);
    Immeuble toEntity(ImmeubleDTO immeubleDTO);
}
