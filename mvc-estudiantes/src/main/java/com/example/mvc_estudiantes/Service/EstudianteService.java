package com.example.mvc_estudiantes.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mvc_estudiantes.Exception.EstudianteDuplicado;
import com.example.mvc_estudiantes.Model.Estudiante;
import com.example.mvc_estudiantes.Repository.EstudianteRepository;
import com.example.mvc_estudiantes.dto.EstudianteRequest;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public Estudiante create(EstudianteRequest request) {
        Long id = request.getId();

        if (repository.existsById(id)) {
            throw new EstudianteDuplicado(id);
        }

        Estudiante estudiante = new Estudiante(
                request.getId(),
                request.getNombre(),
                request.getCarrera()
        );

        return repository.save(estudiante);
    }

    public List<Estudiante> getAll() {
        return repository.findAll();
    }
}

