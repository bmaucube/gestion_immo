package gestion.sn.microservicepersonne.controller;

import gestion.sn.microservicepersonne.dto.PersonneDTO;
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
    public ResponseEntity<PersonneDTO> addPersonne(@RequestBody PersonneDTO dto) {
        return ResponseEntity.ok(service.addPersonne(dto));
    }

    @PutMapping
    public ResponseEntity<PersonneDTO> updatePersonne(@RequestBody PersonneDTO dto) {
        return  ResponseEntity.ok(service.updatePersonne(dto));
    }

    @GetMapping
    public ResponseEntity<List<PersonneDTO>>  getAllPersonnes() {
        return ResponseEntity.ok(service.getAllPersonnes());
    }

    @GetMapping("/{idPers}")
    public PersonneDTO getPersonne(@PathVariable(name = "idPers") Long idPers) {
        return service.getPersonne(idPers);
    }

    @DeleteMapping("/delete/{idPers}")
    public ResponseEntity<Void> deletePersonne(@PathVariable(name = "idPers") Long idPerson) {
        service.deletePersonne(idPerson);
        return ResponseEntity.ok().build();
    }
}
