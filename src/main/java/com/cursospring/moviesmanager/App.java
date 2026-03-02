package com.cursospring.moviesmanager;

import com.cursospring.moviesmanager.model.Interprete;
import com.cursospring.moviesmanager.persistence.InterpreteDAO;

public class App {
    public static void main(String args[]) {
        InterpreteDAO.startSession();

        //1. Creación de intérprete
        Interprete jack = new Interprete("Jack Nicholson", 1961, "USA");
        createInterprete(jack);

        InterpreteDAO.finishSession();
    }
    private static void createInterprete(Interprete interprete) {
        InterpreteDAO.create(interprete);
    }
}
