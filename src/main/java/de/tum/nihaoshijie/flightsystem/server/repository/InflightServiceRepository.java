package de.tum.nihaoshijie.flightsystem.server.repository;

import de.tum.nihaoshijie.flightsystem.server.persistence.InflightService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InflightServiceRepository extends JpaRepository<InflightService, Long> {
}