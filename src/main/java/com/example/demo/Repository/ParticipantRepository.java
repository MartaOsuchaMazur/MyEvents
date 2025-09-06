package com.example.demo.Repository;

import com.example.demo.Entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository <Participant, Long> {
}
