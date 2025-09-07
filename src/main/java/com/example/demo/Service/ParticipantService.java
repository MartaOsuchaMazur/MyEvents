package com.example.demo.Service;

import com.example.demo.Entity.Participant;
import com.example.demo.Repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    public Optional<Participant> findByEmail(String email) {
        return participantRepository.findByEmail(email);
    }
}