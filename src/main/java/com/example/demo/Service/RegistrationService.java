package com.example.demo.Service;

import com.example.demo.Entity.Event;
import com.example.demo.Entity.Participant;
import com.example.demo.Entity.Registration;
import com.example.demo.Exception.AlreadyRegisteredException;
import com.example.demo.Exception.RegistrationFullException;
import com.example.demo.Repository.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;
    private final EventService eventService;
    private final ParticipantService participantService;

    public RegistrationService(RegistrationRepository registrationRepository,
                               EventService eventService,
                               ParticipantService participantService) {
        this.registrationRepository = registrationRepository;
        this.eventService = eventService;
        this.participantService = participantService;
    }

    public Registration register(String participantEmail, Long eventId) {
        Event event = eventService.getEvent(eventId);
        Participant participant = participantService.findByEmail(participantEmail).
                orElseGet(() -> participantService.save(new Participant("Guest", participantEmail)));

        boolean already = event.getRegistrations().stream()
                .anyMatch( reg -> reg.getParticipant().getEmail().equalsIgnoreCase(participantEmail));
        if (already) throw new AlreadyRegisteredException(participantEmail, eventId);

        if (event.getRegistrations().size() >= event.getCapacity()) {
            throw new RegistrationFullException(eventId);
        }

        Registration registration = new Registration(event, participant);
        event.getRegistrations().add(registration);
        participant.getRegistrations().add(registration);
        return registrationRepository.save(registration);
    }
}