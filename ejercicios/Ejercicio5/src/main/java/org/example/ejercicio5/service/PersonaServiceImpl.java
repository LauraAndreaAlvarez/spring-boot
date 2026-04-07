package org.example.ejercicio5.service;

import net.datafaker.Faker;
import org.example.ejercicio5.model.Persona;
import org.springframework.stereotype.Service;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final Faker faker;

    // Inyección de Faker por constructor
    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        return new Persona(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.idNumber().valid(),
                faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
        );
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> lista = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lista.add(findOne());
        }
        return lista;
    }
}