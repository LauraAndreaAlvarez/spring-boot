package org.example.ejercicio6.service;

import net.datafaker.Faker;
import org.example.ejercicio6.model.Prediccion;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrediccionServiceImpl implements PrediccionService {

    private final Faker faker;

    // Spring inyecta el Bean de Faker aquí
    public PrediccionServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public List<Prediccion> obtenerPrediccionSieteDias() {
        List<Prediccion> lista = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            lista.add(new Prediccion(
                    LocalDate.now().plusDays(i),
                    faker.number().numberBetween(0, 101),
                    faker.number().numberBetween(0, 11),
                    faker.number().numberBetween(10, 21),
                    faker.number().numberBetween(0, 6)
            ));
        }
        return lista;
    }
}