package de.tum.nihaoshijie.flightsystem.server.presentation;

import de.tum.nihaoshijie.flightsystem.server.business.FlightService;
import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping( "/flight")
    public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight) {
        if (flight.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(flightService.saveFlight(flight));
    }
}
