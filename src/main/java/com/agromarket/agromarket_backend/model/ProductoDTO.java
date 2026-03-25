package com.agromarket.agromarket_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "producto")
public class ProductoDTO {

    @Id
    private String id;

    private String nombre;
    private String categoria;
    private double precioUnidad;
    private int stock;
    private Date fechaCosecha;

    // Constructor vacío (OBLIGATORIO)
    public ProductoDTO() {}

    // Constructor con parámetros
    public ProductoDTO(String nombre, String categoria, double precioUnidad, int stock, Date fechaCosecha) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnidad = precioUnidad;
        this.stock = stock;
        this.fechaCosecha = fechaCosecha;
    }

    // GETTERS
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecioUnidad() { return precioUnidad; }
    public int getStock() { return stock; }
    public Date getFechaCosecha() { return fechaCosecha; }

    // SETTERS
    public void setId(String id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPrecioUnidad(double precioUnidad) { this.precioUnidad = precioUnidad; }
    public void setStock(int stock) { this.stock = stock; }
    public void setFechaCosecha(Date fechaCosecha) { this.fechaCosecha = fechaCosecha; }
}