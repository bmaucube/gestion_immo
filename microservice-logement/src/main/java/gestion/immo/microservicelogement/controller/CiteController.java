package gestion.immo.microservicelogement.controller;

import gestion.immo.microservicelogement.model.Cite;
import gestion.immo.microservicelogement.repository.CiteRepository;
import gestion.immo.microservicelogement.service.CiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cites")
@RequiredArgsConstructor
public class CiteController{
    private final CiteService service;

    @PostMapping
    public Cite saveCite(@RequestBody Cite cite) {
        return service.saveCite(cite);
    }

    @PutMapping("/{idCite}")
    public Cite updateCite(@RequestBody Cite cite,@PathVariable("idCite") Long id) {
        return service.updateCite(cite);
    }

    @GetMapping("/{idCite}")
    public Cite findCite(@PathVariable("idCite") Long idCite) {
        return service.findCite(idCite);
    }

    @GetMapping
    public List<Cite> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/delete/{idCite}")
    public void deleteCite(@PathVariable("idCite") Long id) {
        service.deleteCite(id);
    }
}
