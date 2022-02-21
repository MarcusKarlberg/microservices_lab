package se.marcus.microservices.locationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.marcus.microservices.locationservice.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
