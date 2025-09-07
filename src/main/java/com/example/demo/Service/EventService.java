package com.example.demo.Service;

import com.example.demo.Entity.Event;
import com.example.demo.Entity.Participant;
import com.example.demo.Entity.Registration;
import com.example.demo.Exception.EventNotFoundException;
import com.example.demo.Repository.EventRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents(){
        return eventRepository.findAll();
    }

    public Event getEvent(Long id) {
      return eventRepository.findById(id)
              .orElseThrow(() -> new EventNotFoundException(id));
    }

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public void delete(Long id){
        eventRepository.deleteById(id);
    }

    @Transactional
    public List<Participant> getParticipantsForEvent(Long eventId) {
        Event event = getEvent(eventId);
        Set<Registration> regs = new HashSet<>(event.getRegistrations());
        return regs.stream().map(Registration::getParticipant).toList();
    }

    public Event updateEvent(Event event) {
        Event existingEvent = eventRepository.findById(event.getId())
                .orElseThrow(() -> new RuntimeException("Event not found with id: "
                        + event.getId()));
        existingEvent.setName(event.getName());
        existingEvent.setDescription(event.getDescription());
        existingEvent.setDate(event.getDate());
        existingEvent.setCapacity(event.getCapacity());
        existingEvent.setLocation(event.getLocation());
        return eventRepository.save(existingEvent);
    }
}