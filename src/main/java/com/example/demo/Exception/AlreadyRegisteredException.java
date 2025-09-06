package com.example.demo.Exception;

public class AlreadyRegisteredException extends RuntimeException {

    public AlreadyRegisteredException(String participantEmail, Long eventId) {
        super("Participant with email " + participantEmail +
                " is already registered for this Event: " + eventId);
    }
}
