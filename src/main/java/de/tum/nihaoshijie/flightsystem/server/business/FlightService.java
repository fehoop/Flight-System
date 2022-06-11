package de.tum.nihaoshijie.flightsystem.server.business;

import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import de.tum.nihaoshijie.flightsystem.server.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Service
public class FlightService {
    private FlightRepository flightRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findFlightsByDepCityAndArrCityAndFlightDate(String origin, String destination, Date date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return flightRepository.findFlightsByDepCityAndArrCityAndFlightDate(origin, destination, sqlDate);
    }
}
