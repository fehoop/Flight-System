package de.tum.nihaoshijie.flightsystem.server.repository;

import de.tum.nihaoshijie.flightsystem.server.persistence.Entertainment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntertainmentRepository extends JpaRepository<Entertainment, Long> {
}