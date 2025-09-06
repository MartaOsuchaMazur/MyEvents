package com.example.demo.Service;

import com.example.demo.Entity.Event;
import com.example.demo.Repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> showEvents(){
        return eventRepository.findAll();
    }

    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    public void delete(Long id){
        eventRepository.deleteById(id);
    }
}
