package de.tum.nihaoshijie.flightsystem.server.repository;

import de.tum.nihaoshijie.flightsystem.server.persistence.flight.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("select f from Flight f where f.id =: id")
    List<Flight> findFlightsByOriginAndDestination(@Param("origin") String origin, @Param("destination") String destination);


}
