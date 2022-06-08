package de.tum.nihaoshijie.flightsystem.server.presentation;

import de.tum.nihaoshijie.flightsystem.server.business.FlightService;
import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flight")
    public List<Flight> getAllFlights() {
        return flightService.findAll();
    }
}
