package gestion.immo.microservicecontrat.dto;

import gestion.immo.microservicecontrat.models.Contrat;
import gestion.immo.microservicecontrat.models.TypeContrat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratDTO {
    private Long numContrat;
    private TypeContrat type;
    private Date dateDebut;
    private Date dateFin;
    private Long idPers;
    private Long idImm;
}
