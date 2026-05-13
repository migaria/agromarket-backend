package com.agromarket.agromarket_backend.service;

import com.agromarket.agromarket_backend.model.CompradorDTO;
import com.agromarket.agromarket_backend.repository.CompradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompradorService {

    @Autowired
    private CompradorRepository compradorRepository;


    public CompradorDTO guardar(CompradorDTO comprador) {
        return compradorRepository.save(comprador);
    }


    public List<CompradorDTO> listar() {
        return compradorRepository.findAll();
    }


    public void eliminar(String id) {
        compradorRepository.deleteById(id);
    }


    public CompradorDTO actualizar(String id, CompradorDTO comprador) {

        comprador.setId(id);

        return compradorRepository.save(comprador);
    }
}