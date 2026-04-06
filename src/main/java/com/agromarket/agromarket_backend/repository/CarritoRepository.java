package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.CarritoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends MongoRepository<CarritoDTO, String> {

}
