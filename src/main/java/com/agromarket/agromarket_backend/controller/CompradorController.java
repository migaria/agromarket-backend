package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.CompradorDTO;
import com.agromarket.agromarket_backend.repository.CompradorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprador")
public class CompradorController {

    private final CompradorRepository repo;

    public CompradorController(CompradorRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CompradorDTO guardar(@RequestBody CompradorDTO comprador) {
        return repo.save(comprador);
    }

    @GetMapping
    public List<CompradorDTO> listar() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }

    @PutMapping("/{id}")
    public CompradorDTO actualizar(@PathVariable String id, @RequestBody CompradorDTO comprador) {
        comprador.setId(id);
        return repo.save(comprador);
    }
}