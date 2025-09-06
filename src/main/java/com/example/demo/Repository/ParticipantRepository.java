package com.example.demo.Repository;

import com.example.demo.Entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParticipantRepository extends JpaRepository <Participant, Long> {
    Optional<Participant> findByEmail(String email);
}
