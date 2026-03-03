package com.cursospring.moviesmanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenero;
    private String name;

    public Genero(String name) {
        this.name = name;
    }


    public Genero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "id=" + idGenero +
                ", name='" + name + '\'' +
                '}';
    }
}
