package gestion.immo.microservicelogement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import gestion.immo.microservicelogement.model.Immeuble;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CiteDTO {
    private Long id;
    private String nom;

    @JsonIgnore
    private List<Immeuble> immeubles;
}
