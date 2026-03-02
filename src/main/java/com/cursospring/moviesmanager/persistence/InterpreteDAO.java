package com.cursospring.moviesmanager.persistence;

import com.cursospring.moviesmanager.model.Interprete;

public class InterpreteDAO extends SessionManager{
    public static void create(Interprete interprete) {
        startSession();
        session.beginTransaction();
        session.persist(interprete);
        session.getTransaction().commit();
        System.out.println("¡Intérprete creado/a con éxito!");
    }
}
