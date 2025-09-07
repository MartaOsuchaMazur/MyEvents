package com.example.demo.Controller;

import com.example.demo.Entity.Registration;
import com.example.demo.Service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/events/{eventId}")
    public ResponseEntity<Registration> register(@RequestParam String email, @PathVariable Long eventId) {
        return ResponseEntity.ok(registrationService.register(email, eventId));
    }
}
