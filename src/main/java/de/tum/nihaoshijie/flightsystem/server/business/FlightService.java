package de.tum.nihaoshijie.flightsystem.server.business;

import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import de.tum.nihaoshijie.flightsystem.server.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {
    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findFlightsByOriginAndDestination(String origin, String destination) {
        return flightRepository.findFlightsByOriginAndDestination(origin, destination);
    }
    //todo: Date??
//    public List<Flight> findFlightsByOriginAndDestinationAndDate(String origin, String destination, Date date) {
//        return flightRepository.findFlightsByOriginAndDestination(origin, destination);
//    }
    public List<Flight> findAll() {
        List<Flight> flights = new ArrayList<Flight>();
        flightRepository.findAll().forEach(flight -> flights.add(flight));
        return flights;
//        throw new UnsupportedOperationException();
    }
    public void saveOrUpdateFlight(Flight flight)
    {
        flightRepository.save(flight);
    }

    public void deleteFlight(long id)
    {
        flightRepository.deleteById(id);
    }


}
