package com.ejerciciodosjpa.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_dueno;
    private int dni;
    private String nombre;
    private String apellido;
    private int celular;
    @OneToOne
    @JoinColumn(name = "id_mascota", referencedColumnName = "id_mascota")
    private Mascota mascota;

    public Dueno() {
    }

    public Dueno(Integer id_dueno, int dni, String nombre, String apellido, int celular, Mascota mascota) {
        this.id_dueno = id_dueno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.mascota = mascota;
    }

    public Integer getId_dueno() {
        return id_dueno;
    }

    public void setId_dueno(Integer id_dueno) {
        this.id_dueno = id_dueno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}
