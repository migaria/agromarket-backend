package com.agromarket.agromarket_backend.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Producto")
public class Producto {

    @JsonProperty("id")
    @Id
    private String id;

    private String nombre;

    private String categoria;

    private double precio;

    private int stock;

    private String imagen;

    public Producto() {
    }

    public Producto(
            String nombre,
            String categoria,
            double precio,
            int stock,
            String imagen
    ) {

        this.nombre = nombre;

        this.categoria = categoria;

        this.precio = precio;

        this.stock = stock;

        this.imagen = imagen;

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getCategoria() {

        return categoria;

    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;

    }

    public double getPrecio() {

        return precio;

    }

    public void setPrecio(double precio) {

        this.precio = precio;

    }

    public int getStock() {

        return stock;

    }

    public void setStock(int stock) {

        this.stock = stock;

    }

    public String getImagen() {

        return imagen;

    }

    public void setImagen(String imagen) {

        this.imagen = imagen;

    }

}