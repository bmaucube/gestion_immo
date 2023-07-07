package gestion.sn.microservicepersonne.controller;

import gestion.sn.microservicepersonne.models.Personne;
import gestion.sn.microservicepersonne.services.PersonneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personnes")
@RequiredArgsConstructor
public class PersonneController{
    private final PersonneService service;

    @PostMapping
    public ResponseEntity<Personne> addPersonne(@RequestBody Personne personne) {
        return ResponseEntity.ok(service.addPersonne(personne));
    }

    @PutMapping
    public ResponseEntity<Personne> updatePersonne(@RequestBody Personne personne) {
        return  ResponseEntity.ok(service.updatePersonne(personne));
    }

    @GetMapping
    public ResponseEntity<List<Personne>>  getAllPersonnes() {
        return ResponseEntity.ok(service.getAllPersonnes());
    }

    @GetMapping("/{idPers}")
    public Personne getPersonne(@PathVariable(name = "idPers") Long idPers) {
        return service.getPersonne(idPers);
    }

    @DeleteMapping("/delete/{idPers}")
    public ResponseEntity<Void> deletePersonne(@PathVariable(name = "idPers") Long idPerson) {
        service.deletePersonne(idPerson);
        return ResponseEntity.ok().build();
    }
}
