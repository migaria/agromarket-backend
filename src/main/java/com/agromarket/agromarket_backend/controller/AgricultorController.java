package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.AgricultorDTO;
import com.agromarket.agromarket_backend.repository.AgricultorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agricultor")
public class AgricultorController {

    private final AgricultorRepository repo;

    public AgricultorController(AgricultorRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public AgricultorDTO guardar(@RequestBody AgricultorDTO agricultor) {
        return repo.save(agricultor);
    }

    @GetMapping
    public List<AgricultorDTO> listar() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }

    @PutMapping("/{id}")
    public AgricultorDTO actualizar(@PathVariable String id, @RequestBody AgricultorDTO agricultor) {
        agricultor.setId(id);
        return repo.save(agricultor);
    }
}