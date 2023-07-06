package gestion.immo.microservicelogement.dto;

import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.model.Cite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImmeubleDTO {
    private Long id;
    private String nom;
    private String adresse;
    @ManyToOne
    private Cite cite;
    private Long idPers;
    private List<Appartement> appartements;
}
