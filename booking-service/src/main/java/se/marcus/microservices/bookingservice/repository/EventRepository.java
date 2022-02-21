package se.marcus.microservices.bookingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.marcus.microservices.bookingservice.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
