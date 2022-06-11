package de.tum.nihaoshijie.flightsystem.server.presentation;

import de.tum.nihaoshijie.flightsystem.server.business.FlightService;
import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class FlightController {
    private FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flight")
    public List<Flight> findFlightsByOriginAndDestinationWithDate(@RequestParam("origin") String origin, @RequestParam("destination") String destination, @RequestParam("date") String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null; // TODO: d cannot be null!
        try {
            d = sdf.parse(date);
        }catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        return flightService.findFlightsByDepCityAndArrCityAndFlightDate(origin, destination, d);
    }

}
