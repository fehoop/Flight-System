package de.tum.nihaoshijie.flightsystem.server.repository;

import de.tum.nihaoshijie.flightsystem.server.persistence.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {
    @Query("select f from Flight f where f.id =: id")
    List<Flight> findFlightsByOriginAndDestination(@Param("origin") String origin, @Param("destination") String destination);
//    List<Flight> findFlightsByOriginAndDestinationAndDate(@Param("origin") String origin, @Param("destination") String destination, @Param("date") Date date);


}
