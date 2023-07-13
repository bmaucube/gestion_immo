package gestion.immo.microservicelogement.controller;

import gestion.immo.microservicelogement.dto.ImmeubleDTO;
import gestion.immo.microservicelogement.model.Immeuble;
import gestion.immo.microservicelogement.service.ImmeubleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/immeubles")
@RequiredArgsConstructor
public class ImmeubleController{
    private final ImmeubleService service;

    @PostMapping
    public ImmeubleDTO saveImmeuble(@RequestBody ImmeubleDTO immeubleDTO) {
        return service.saveImmeuble(immeubleDTO);
    }


    @PutMapping
    public ImmeubleDTO updateImmeuble(@RequestBody ImmeubleDTO immeubleDTO) {
        return service.updateImmeuble(immeubleDTO);
    }


    @GetMapping("/{idImmeuble}")
    public ImmeubleDTO findImmeuble(@PathVariable("idImmeuble") Long idImmeuble) {
        return service.findImmeuble(idImmeuble);
    }

    @GetMapping
    public List<ImmeubleDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/delete/{idImmeuble}")
    public void deleteImmeuble(@PathVariable(name = "idImmeuble") Long id) {
        service.deleteImmeuble(id);
    }
}
