package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.CompradorDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends MongoRepository<CompradorDTO, String> {

}