package gestion.sn.microservicepersonne.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonneDTO {
    private Long idpers;
    private String CIN;
    private String nom;
    private String  prenom;
    private Date birthday;
    private String email;
    private String adresse;
}
