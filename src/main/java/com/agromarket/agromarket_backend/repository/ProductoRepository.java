package com.agromarket.agromarket_backend.repository;

import com.agromarket.agromarket_backend.model.ProductoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends MongoRepository<ProductoDTO, String> {

    // Buscar por nombre
    List<ProductoDTO> findByNombre(String nombre);

    // Buscar por categoría
    List<ProductoDTO> findByCategoria(String categoria);

    // Buscar productos con precio menor
    List<ProductoDTO> findByPrecioUnidadLessThan(double precio);

    // Buscar productos con stock mayor
    List<ProductoDTO> findByStockGreaterThan(int stock);
}