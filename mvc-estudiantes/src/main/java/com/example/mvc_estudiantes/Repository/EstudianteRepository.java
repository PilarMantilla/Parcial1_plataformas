package com.example.mvc_estudiantes.Repository;

import com.example.mvc_estudiantes.Model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class EstudianteRepository {

    private final Map<Long, Estudiante> data = new ConcurrentHashMap<>();

    public boolean existsById(Long id) {
        return data.containsKey(id);
    }

    public Estudiante save(Estudiante estudiante) {
        data.put(estudiante.getId(), estudiante);
        return estudiante;
    }

    public List<Estudiante> findAll() {
        return new ArrayList<>(data.values());
    }
}

