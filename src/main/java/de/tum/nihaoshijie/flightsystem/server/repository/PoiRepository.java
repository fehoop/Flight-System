package de.tum.nihaoshijie.flightsystem.server.repository;

import de.tum.nihaoshijie.flightsystem.server.persistence.Poi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoiRepository extends JpaRepository<Poi, Long> {
}