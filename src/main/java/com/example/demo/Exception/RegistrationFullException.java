package com.example.demo.Exception;

public class RegistrationFullException extends RuntimeException {

    public RegistrationFullException(Long eventId) {
        super("Event " + eventId + " is full");
    }
}
