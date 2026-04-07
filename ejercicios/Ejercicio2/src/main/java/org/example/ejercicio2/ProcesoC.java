package org.example.ejercicio2;


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
        System.out.println("Hola desde la clase: " + this.getClass().getSimpleName());
    }
}