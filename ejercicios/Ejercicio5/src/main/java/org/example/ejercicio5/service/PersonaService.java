package org.example.ejercicio5.service;

import org.example.ejercicio5.model.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> find(int count);
    Persona findOne();
}
