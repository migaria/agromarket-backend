package com.agromarket.agromarket_backend.controller;

import com.agromarket.agromarket_backend.model.CompradorDTO;
import com.agromarket.agromarket_backend.service.CompradorService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprador")
@CrossOrigin(origins = "*")
public class CompradorController {

    private final CompradorService compradorService;

    public CompradorController(CompradorService compradorService) {

        this.compradorService = compradorService;
    }


    @PostMapping
    public CompradorDTO guardar(@RequestBody CompradorDTO comprador) {

        return compradorService.guardar(comprador);
    }

    @GetMapping
    public List<CompradorDTO> listar() {

        return compradorService.listar();
    }


    @GetMapping("/{id}")
    public CompradorDTO obtenerPorId(@PathVariable String id) {

        return compradorService.obtenerPorId(id);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {

        compradorService.eliminar(id);
    }


    @PutMapping("/{id}")
    public CompradorDTO actualizar(@PathVariable String id,
                                   @RequestBody CompradorDTO comprador) {

        return compradorService.actualizar(id, comprador);
    }
}