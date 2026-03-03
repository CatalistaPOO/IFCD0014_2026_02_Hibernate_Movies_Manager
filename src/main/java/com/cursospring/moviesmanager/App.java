package com.cursospring.moviesmanager;

import com.cursospring.moviesmanager.model.Genero;
import com.cursospring.moviesmanager.model.Pelicula;
import com.cursospring.moviesmanager.persistence.GeneroDAO;

import java.util.ArrayList;
import java.util.List;

import static com.cursospring.moviesmanager.persistence.PeliculaDAO.create;

public class App {
    public static void main(String args[]) {
        GeneroDAO.startSession();

        //1. Creación de genero
        Genero genero1 = new Genero("genero1");
        createGenero(genero1);



        //2. Creación de Película



        Pelicula pelí = new Pelicula("Otra Película", "Tom", 2000, genero1);
        create(pelí);

        GeneroDAO.finishSession();
    }
    private static void createGenero(Genero genero) {
        GeneroDAO.create(genero);
    }
}
