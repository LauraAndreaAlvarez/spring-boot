package org.example.ejercicio3;

import org.example.ejercicio3.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoC implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoC(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("Hola desde la clase: " + this.getClass().getName());
    }
}