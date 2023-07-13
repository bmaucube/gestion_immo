package gestion.immo.microservicelogement.controller;

import gestion.immo.microservicelogement.dto.AppartementDTO;
import gestion.immo.microservicelogement.model.Appartement;
import gestion.immo.microservicelogement.service.AppartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appartements")
@RequiredArgsConstructor
public class AppartementController{
    private final AppartementService service;

    @PostMapping
    public AppartementDTO saveAppartement(@RequestBody AppartementDTO dto) {
        return service.saveAppartement(dto);
    }

    @PutMapping("/{idAppatement}")
    public AppartementDTO updateAppartement(AppartementDTO dto) {
        return service.updateAppartement(dto);
    }

    @GetMapping("/{idApp}")
    public AppartementDTO findAppartement(@PathVariable("idApp") Long idAppartement) {
        return service.findAppartement(idAppartement);
    }

    @GetMapping
    public List<AppartementDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/delete/{idApp}")
    public void deleteAppartement(@PathVariable("idApp") Long idAppartement) {
        service.deleteAppartement(idAppartement);
    }
}
