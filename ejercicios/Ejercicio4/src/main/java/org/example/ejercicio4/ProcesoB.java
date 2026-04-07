package org.example.ejercicio4;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProcesoB implements CommandLineRunner {

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoB(@Qualifier("systemErrMessageService") MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
        String frase = faker.bigBangTheory().quote();
        messageService.showMessage("Clase: " + this.getClass().getName() + " - Frase: " + frase);
    }
}