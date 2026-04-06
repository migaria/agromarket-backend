package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.Producto;
import com.agromarket.agromarket_backend.repository.ProductoRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

    private final ProductoRepository repo;
    private final MongoTemplate mongoTemplate;

    public ProductoController(ProductoRepository repo, MongoTemplate mongoTemplate) {
        this.repo = repo;
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/debug")
    public String debug() {
        return mongoTemplate.getDb().getName();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return repo.save(producto);
    }

    @GetMapping
    public List<Producto> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable String id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }
}