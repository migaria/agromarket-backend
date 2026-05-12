package com.agromarket.agromarket_backend.service;

import com.agromarket.agromarket_backend.model.AgricultorDTO;
import com.agromarket.agromarket_backend.repository.AgricultorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgricultorService {

    @Autowired
    private AgricultorRepository agricultorRepository;


    public AgricultorDTO guardar(AgricultorDTO agricultor) {
        return agricultorRepository.save(agricultor);
    }

    public List<AgricultorDTO> listar() {
        return agricultorRepository.findAll();
    }


    public void eliminar(String id) {
        agricultorRepository.deleteById(id);
    }


    public AgricultorDTO actualizar(String id, AgricultorDTO agricultor) {

        agricultor.setId(id);

        return agricultorRepository.save(agricultor);
    }
}
