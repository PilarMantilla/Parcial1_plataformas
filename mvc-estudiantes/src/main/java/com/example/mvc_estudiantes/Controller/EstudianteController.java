package com.example.mvc_estudiantes.Controller;


import com.example.mvc_estudiantes.dto.EstudianteRequest;
import com.example.mvc_estudiantes.Model.Estudiante;
import com.example.mvc_estudiantes.Service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    // POST /estudiantes -> 201 Created
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante create(@Valid @RequestBody EstudianteRequest request) {
        return service.create(request);
    }

    // GET /estudiantes -> 200 OK
    @GetMapping
    public List<Estudiante> getAll() {
        return service.getAll();
    }
}

