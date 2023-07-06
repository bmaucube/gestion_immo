package gestion.immo.microservicecontrat.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numContrat;
    @Enumerated(EnumType.STRING)
    private TypeContrat type;
    private Date dateDebut;
    private Date dateFin;
    private Long idPers;
    private Long idImm;
}
