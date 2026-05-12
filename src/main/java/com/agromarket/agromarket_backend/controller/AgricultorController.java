package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.AgricultorDTO;
import com.agromarket.agromarket_backend.service.AgricultorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agricultor")
@CrossOrigin(origins = "http://localhost:4200")
public class AgricultorController {

    @Autowired
    private AgricultorService agricultorService;


    @PostMapping
    public AgricultorDTO guardar(@RequestBody AgricultorDTO agricultor) {
        return agricultorService.guardar(agricultor);
    }


    @GetMapping
    public List<AgricultorDTO> listar() {
        return agricultorService.listar();
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        agricultorService.eliminar(id);
    }


    @PutMapping("/{id}")
    public AgricultorDTO actualizar(
            @PathVariable String id,
            @RequestBody AgricultorDTO agricultor) {

        return agricultorService.actualizar(id, agricultor);
    }
}