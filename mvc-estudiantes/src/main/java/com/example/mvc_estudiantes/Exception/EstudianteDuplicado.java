package com.example.mvc_estudiantes.Exception;

public class EstudianteDuplicado extends RuntimeException{
    public EstudianteDuplicado(Long id) {
        super("Ya existe un estudiante con id: " + id);
    }
}
