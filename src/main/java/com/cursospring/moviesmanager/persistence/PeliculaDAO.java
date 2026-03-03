package com.cursospring.moviesmanager.persistence;

import com.cursospring.moviesmanager.model.Pelicula;

public class PeliculaDAO extends SessionManager{
    public static void create(Pelicula pelicula) {
        startSession();
        session.beginTransaction();
        session.persist(pelicula);
        session.getTransaction().commit();
        System.out.println("¡Intérprete creado/a con éxito!");
    }
}
