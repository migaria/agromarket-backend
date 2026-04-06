package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.CarritoDTO;
import com.agromarket.agromarket_backend.repository.CarritoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    private final CarritoRepository repo;

    public CarritoController(CarritoRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CarritoDTO guardar(@RequestBody CarritoDTO carrito) {
        return repo.save(carrito);
    }

    @GetMapping
    public List<CarritoDTO> listar() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        repo.deleteById(id);
    }

    @PutMapping("/{id}")
    public CarritoDTO actualizar(@PathVariable String id, @RequestBody CarritoDTO carrito) {
        carrito.setId(id);
        return repo.save(carrito);
    }
}