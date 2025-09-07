package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank (message = "City cannot be blank")
    private String city;

    @NotBlank (message = "Address cannot be blank")
    private String address;

    public Location() {
    }

    public Location(Long id, String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }
}
