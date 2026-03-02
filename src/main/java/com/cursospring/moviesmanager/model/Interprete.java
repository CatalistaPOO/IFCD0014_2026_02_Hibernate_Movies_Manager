package com.cursospring.moviesmanager.model;

import jakarta.persistence.*;

@Entity
@Table(name="t_cast")
public class Interprete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int anyoNacimiento;
    private String nacionalidad;

    public Interprete(){}

    public Interprete(String nombre, int anyoNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public Interprete(int id, String nombre, int anyoNacimiento, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
