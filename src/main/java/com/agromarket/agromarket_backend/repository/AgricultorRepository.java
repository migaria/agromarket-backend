package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.AgricultorDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgricultorRepository extends MongoRepository<AgricultorDTO, String> {

}