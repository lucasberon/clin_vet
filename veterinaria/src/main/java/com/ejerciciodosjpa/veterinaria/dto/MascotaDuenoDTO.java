
package com.ejerciciodosjpa.veterinaria.dto;


public class MascotaDuenoDTO {
    
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueno;
    private String apellido_dueno;

    public MascotaDuenoDTO() {
    }

    public MascotaDuenoDTO(String nombre_mascota, String especie, String raza, String nombre_dueno, String apellido_dueno) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_dueno = nombre_dueno;
        this.apellido_dueno = apellido_dueno;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre_dueno() {
        return nombre_dueno;
    }

    public void setNombre_dueno(String nombre_dueno) {
        this.nombre_dueno = nombre_dueno;
    }

    public String getApellido_dueno() {
        return apellido_dueno;
    }

    public void setApellido_dueno(String apellido_dueno) {
        this.apellido_dueno = apellido_dueno;
    }
    
    
    
    
    
}
