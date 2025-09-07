package com.example.demo.Controller;

import com.example.demo.Entity.Event;
import com.example.demo.Service.EventService;
import com.example.demo.Service.ParticipantService;
import com.example.demo.Service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/events")
public class EventViewController {

    private final EventService eventService;

    public EventViewController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public String indexView(Model model){
        model.addAttribute("events", eventService.getEvents());
        return "event/index";
    }

    @GetMapping("/{id}")
    public String singleView(Model model, @PathVariable Long id) {
        model.addAttribute("event", eventService.getEvent(id));
        model.addAttribute("participants", eventService.getParticipantsForEvent(id));
        return "event/single";
    }

    @GetMapping("/add")
    public String addView(Model model) {
        model.addAttribute("event", new Event());
        return "event/add";
    }

    @PostMapping
    public String add(Event event) {
        eventService.addEvent(event);
        return "redirect:/events";
    }
}
