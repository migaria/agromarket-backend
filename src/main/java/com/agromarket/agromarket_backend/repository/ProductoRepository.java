package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}