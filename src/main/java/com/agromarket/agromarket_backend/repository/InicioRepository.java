package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.Inicio;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface InicioRepository extends MongoRepository<Inicio, String> {

    Optional<Inicio> findByNombre(String nombre);

}
