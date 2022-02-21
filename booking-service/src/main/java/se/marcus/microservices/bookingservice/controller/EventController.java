package se.marcus.microservices.bookingservice.controller;

import org.springframework.web.bind.annotation.*;
import se.marcus.microservices.bookingservice.model.Event;
import se.marcus.microservices.bookingservice.service.EventService;

import java.util.List;

@RestController
@RequestMapping("events")
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
