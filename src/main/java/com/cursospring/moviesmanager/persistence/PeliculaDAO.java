package com.cursospring.moviesmanager.persistence;

import com.cursospring.moviesmanager.model.Pelicula;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

import static com.cursospring.moviesmanager.persistence.SessionManager.session;
import static com.cursospring.moviesmanager.persistence.SessionManager.startSession;

public class PeliculaDAO extends SessionManager{
    public static void create(Pelicula pelicula) {
        startSession();
        try {
            session.beginTransaction();
            session.persist(pelicula);
            session.getTransaction().commit();
            System.out.println("¡Película creada con éxito!");
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            System.err.println("Error al crear la película: " + e.getMessage());
            e.printStackTrace();
        }
        }


    public static List<Pelicula> searchBeforeYear(int anyo){
        startSession();
        TypedQuery<Pelicula> query = session.createQuery
                ("FROM Pelicula p WHERE p.anyo >= :year ORDER BY p.anyo DESC", Pelicula.class);
        query.setParameter("year", anyo);
        System.out.println("\n\n");
        return query.getResultList();
    }

    public static List<Pelicula> searchWithGenero(String generoType){
        startSession();
        TypedQuery<Pelicula> query = session.createQuery
                ("SELECT p FROM Pelicula p WHERE p.genero.name LIKE :gen", Pelicula.class);
        query.setParameter("gen", "%" + generoType + "%");
        System.out.println("\n\n");
        return query.getResultList();
    }

    public static List<Pelicula> searchWithTitle(String cadenaBuscada){

        startSession();

        Query query = session.createNamedQuery("Pelicula.findByTittle", Pelicula.class);
        query.setParameter("cadena", "%" + cadenaBuscada.toLowerCase() + "%");
        List<Pelicula> peliculasTitulo = new ArrayList<Pelicula>(query.getResultList());

        return peliculasTitulo;

    }


}
