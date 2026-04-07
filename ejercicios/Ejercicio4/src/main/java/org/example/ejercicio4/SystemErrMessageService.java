package org.example.ejercicio4;

import org.springframework.stereotype.Component;

@Component
public class SystemErrMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.err.println(message);
    }
}