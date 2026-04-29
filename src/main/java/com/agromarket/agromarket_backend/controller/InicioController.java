package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.Inicio;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.agromarket.agromarket_backend.repository.InicioRepository;




@RestController
@RequestMapping("/api/inicio")
@CrossOrigin(origins = "*")
public class InicioController {
    private final InicioRepository repository;

    public InicioController(InicioRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/{nombre}")
    public Inicio obtenerPorNombre(@PathVariable String nombre) {
        return repository.findByNombre(nombre)
                .orElseThrow(() -> new RuntimeException("Inicio no encontrado"));
    }


    @PostMapping
    public Inicio guardar(@RequestBody Inicio inicio) {
        return repository.save(inicio);
    }

}
