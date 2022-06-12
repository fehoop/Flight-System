package de.tum.nihaoshijie.flightsystem.server.business;

import de.tum.nihaoshijie.flightsystem.common.model.FlightModel;
import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import de.tum.nihaoshijie.flightsystem.server.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Service
public class FlightService {
    private FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public void addFlight (FlightModel flight) {
        // TODO: 1. check if this flight is in database, if yes -> 2
        // TODO: 2. check if this flight has already been added ->
        // TODO: 3. add to user_flight
    }

    public List<Flight> findFlightsByDepCityAndArrCityAndFlightDate(String origin, String destination, Date date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return flightRepository.findFlightsByDepCityAndArrCityAndFlightDate(origin, destination, sqlDate);
    }
}
