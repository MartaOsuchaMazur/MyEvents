package com.example.config;

import com.example.demo.Entity.Event;
import com.example.demo.Entity.Location;
import com.example.demo.Repository.EventRepository;
import com.example.demo.Repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataInitializer {

//    @Bean
//    CommandLineRunner initDatabase(EventRepository eventRepository, LocationRepository locationRepository) {
//        return args -> {
//            Location loc1 = new Location(null, "City Hall", "Warsaw", "Main Street 1");
//            Location loc2 = new Location(null, "Tech Center", "Krakow", "Tech Street 5");
//
//            locationRepository.save(loc1);
//            locationRepository.save(loc2);
//
//            Event e1 = new Event(null, "Spring Boot Workshop", "Full-day workshop", LocalDate.now().plusDays(10), 50, loc1);
//            Event e2 = new Event(null, "Java Conference", "Annual Java conference", LocalDate.now().plusWeeks(2), 200, loc2);
//
//            eventRepository.save(e1);
//            eventRepository.save(e2);
//        };
//    }
}
