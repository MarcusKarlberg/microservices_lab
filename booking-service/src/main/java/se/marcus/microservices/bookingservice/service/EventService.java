package se.marcus.microservices.bookingservice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import se.marcus.microservices.bookingservice.model.Event;
import se.marcus.microservices.bookingservice.repository.EventRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
        return eventRepository.save(new Event(event.getTitle(), event.getStart(), event.getEnd(), event.getOwner()));
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
