package se.marcus.microservices.locationservice.service;

import org.springframework.stereotype.Service;
import se.marcus.microservices.locationservice.model.Location;
import se.marcus.microservices.locationservice.repository.LocationRepository;

import java.util.List;

@Service
public class LocationService {

    private LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createLocation(Location location) {
        return locationRepository
                .save(new Location(location.getName(), location.getAddress(), location.getRate(), location.getCurrency()));
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
