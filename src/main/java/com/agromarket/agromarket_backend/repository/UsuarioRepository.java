package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.UsuarioDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<UsuarioDTO, String> {

    Optional<UsuarioDTO> findByCorreo(String correo);
}