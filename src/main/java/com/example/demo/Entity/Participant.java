package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "Name cannot be blank")
    private String name;

    @Email (message = "Invalid email")
    @NotBlank (message = "Email cannot be blank")
    private String email;

    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private Set<Registration> registrations = new HashSet<>();

    public Participant(String guest, String participantEmail) {
    }
}
