package gestion.immo.microservicelogement.controller;

import gestion.immo.microservicelogement.dto.CiteDTO;
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
    public CiteDTO saveCite(@RequestBody CiteDTO cite) {
        return service.saveCite(cite);
    }

    @PutMapping("/{idCite}")
    public CiteDTO updateCite(@RequestBody CiteDTO dto) {
        return service.updateCite(dto);
    }

    @GetMapping("/{idCite}")
    public CiteDTO findCite(@PathVariable("idCite") Long idCite) {
        return service.findCite(idCite);
    }

    @GetMapping
    public List<CiteDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/delete/{idCite}")
    public void deleteCite(@PathVariable("idCite") Long id) {
        service.deleteCite(id);
    }
}
