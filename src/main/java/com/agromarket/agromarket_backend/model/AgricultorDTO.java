package com.agromarket.agromarket_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "agricultores")
public class AgricultorDTO {

    @Id
    private String id;

    private String nombre;
    private String finca;
    private String ubicacion;
    private String telefono;

    public AgricultorDTO() {}

    public AgricultorDTO(String nombre, String finca, String ubicacion, String telefono) {
        this.nombre = nombre;
        this.finca = finca;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFinca() { return finca; }
    public void setFinca(String finca) { this.finca = finca; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}