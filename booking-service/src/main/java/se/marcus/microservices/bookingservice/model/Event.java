package se.marcus.microservices.bookingservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private LocalDateTime start;

    private LocalDateTime end;

    private String owner;

    private Long locationId;

    public Event(String title, LocalDateTime start, LocalDateTime end, String owner, Long locationId) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.owner = owner;
        this.locationId = locationId;
    }

    public Event(String title, LocalDateTime start, LocalDateTime end, String owner) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.owner = owner;
    }

    public Event() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
