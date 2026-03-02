package com.cursospring.moviesmanager.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="t_movie")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String titulo;
    private String director;
    @Column(name="year")
    private int anyo;
    @OneToMany
    private List<Interprete> reparto;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int anyo, List<Interprete> reparto) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.reparto = reparto;
    }

    public Pelicula(int id, String titulo, String director, int anyo, List<Interprete> reparto) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.reparto = reparto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public List<Interprete> getReparto() {
        return reparto;
    }

    public void setReparto(List<Interprete> reparto) {
        this.reparto = reparto;
    }
}
