package org.example.ejercicio4;

import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ProcesoA implements CommandLineRunner {

    private final MessageService messageService;
    private final Faker faker;

    // Se añade Faker al constructor
    public ProcesoA(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        String frase = faker.backToTheFuture().quote();
        messageService.showMessage("Clase: " + this.getClass().getName() + " - Frase: " + frase);
    }
}