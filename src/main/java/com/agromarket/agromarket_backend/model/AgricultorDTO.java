package com.agromarket.agromarket_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "agricultores")
public class AgricultorDTO {

    @Id
    private String id;

    private String nombre;
    private int cantidad;
    private double precio;
    private String tipo;
    private String imagen;

    public AgricultorDTO() {}

    public AgricultorDTO(String nombre, int cantidad,
                         double precio, String tipo, String imagen) {

        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    // GETTERS

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getImagen() {
        return imagen;
    }

    // SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}