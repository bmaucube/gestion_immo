package gestion.immo.microservicelogement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.source.doctree.IndexTree;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany
    @JsonIgnore
    private List<Immeuble> immeubles;
}
