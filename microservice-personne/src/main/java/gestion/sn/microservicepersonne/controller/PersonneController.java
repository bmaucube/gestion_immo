package gestion.sn.microservicepersonne.controller;

import gestion.sn.microservicepersonne.dto.PersonneDTO;
import gestion.sn.microservicepersonne.services.PersonneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personnes")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class PersonneController{
    private final PersonneService service;

    @PostMapping
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public ResponseEntity<PersonneDTO> addPersonne(@RequestBody PersonneDTO dto) {
        return ResponseEntity.ok(service.addPersonne(dto));
    }

    @PutMapping
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public ResponseEntity<PersonneDTO> updatePersonne(@RequestBody PersonneDTO dto) {
        return  ResponseEntity.ok(service.updatePersonne(dto));
    }

    @GetMapping
    @PreAuthorize("hasAuthority('SCOPE_USER')")
    public ResponseEntity<List<PersonneDTO>>  getAllPersonnes() {
        return ResponseEntity.ok(service.getAllPersonnes());
    }

    @GetMapping("/{idPers}")
    @PreAuthorize("hasAuthority('SCOPE_USER')")
    public PersonneDTO getPersonne(@PathVariable(name = "idPers") Long idPers) {
        return service.getPersonne(idPers);
    }

    @DeleteMapping("/delete/{idPers}")
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public ResponseEntity<Void> deletePersonne(@PathVariable(name = "idPers") Long idPerson) {
        service.deletePersonne(idPerson);
        return ResponseEntity.ok().build();
    }
}
