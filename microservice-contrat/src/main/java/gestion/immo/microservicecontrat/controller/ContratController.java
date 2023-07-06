package gestion.immo.microservicecontrat.controller;

import gestion.immo.microservicecontrat.dto.ContratDTO;
import gestion.immo.microservicecontrat.models.Contrat;
import gestion.immo.microservicecontrat.services.ContratService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contrats")
@RequiredArgsConstructor
public class ContratController{
    private final ContratService service;

    @PostMapping
    public ResponseEntity<ContratDTO> createContrat(@RequestBody ContratDTO contratDTO) {
        return ResponseEntity.ok(service.createContrat(contratDTO));
    }

    @PutMapping
    public ResponseEntity<ContratDTO> updateContrat(@RequestBody ContratDTO contratDTO) {
        return ResponseEntity.ok(service.updateContrat(contratDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContratDTO> findContrat(@PathVariable("id") Long numContrat) {
        return ResponseEntity.ok(service.findContrat(numContrat));
    }

    @GetMapping
    public  ResponseEntity<List<ContratDTO>> findAllContrats() {
        return ResponseEntity.ok(service.findAllContrats());
    }

    @DeleteMapping("/delete/{numContrat}")
    public ResponseEntity<Void> deleteContrat(@PathVariable("numContrat") Long id) {
       service.deleteContrat(id);
       return ResponseEntity.ok().build();
    }
}
