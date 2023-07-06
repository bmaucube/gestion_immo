package gestion.immo.microservicelogement.controller;

import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.service.AppartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appatements")
@RequiredArgsConstructor
public class AppartementController{
    private final AppartementService service;

    @PostMapping
    public Appartement saveAppartement(@RequestBody Appartement appartement) {
        return service.saveAppartement(appartement);
    }

    @PutMapping("/{idAppatement}")
    public Appartement updateAppartement(Appartement appartement, @PathVariable("idAppartement") Long id) {
        return service.updateAppartement(appartement);
    }

    @GetMapping("/{idApp}")
    public Appartement findAppartement(@PathVariable("idApp") Long idAppartement) {
        return service.findAppartement(idAppartement);
    }

    @GetMapping
    public List<Appartement> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/delete/{idApp}")
    public void deleteAppartement(@PathVariable("idApp") Long idAppartement) {
        service.deleteAppartement(idAppartement);
    }
}
