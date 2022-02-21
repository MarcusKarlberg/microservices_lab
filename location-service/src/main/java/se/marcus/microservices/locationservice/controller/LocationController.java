package se.marcus.microservices.locationservice.controller;

import org.springframework.web.bind.annotation.*;
import se.marcus.microservices.locationservice.model.Location;
import se.marcus.microservices.locationservice.service.LocationService;

import java.util.List;

@RestController
@RequestMapping("locations")
public class LocationController {

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationService.createLocation(location);
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}
