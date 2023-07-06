package gestion.immo.microservicelogement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appartement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private Long idPers;
    @ManyToOne
    private Immeuble immeuble;
    private Long nbChambre;

    @ManyToOne
    private Appartement appartement;
}
