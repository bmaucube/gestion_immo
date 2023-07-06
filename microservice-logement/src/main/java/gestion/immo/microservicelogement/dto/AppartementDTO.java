package gestion.immo.microservicelogement.dto;

import gestion.immo.microservicelogement.model.Immeuble;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppartementDTO {
    private Long num;
    private Long idPers;
    private Immeuble immeuble;
    private Long nbChambre;
}
