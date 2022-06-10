package de.tum.nihaoshijie.flightsystem.server.business;

import de.tum.nihaoshijie.flightsystem.server.persistence.inflightservice.Service;
import de.tum.nihaoshijie.flightsystem.server.repository.InFlightServiceRepository;

import java.util.Optional;

public class InFlightServiceService {
    private InFlightServiceRepository inFlightServiceRepository;

    public InFlightServiceService(InFlightServiceRepository inFlightServiceRepository) {
        this.inFlightServiceRepository = inFlightServiceRepository;
    }

    public Optional<Service> getService (Service service) {
        return inFlightServiceRepository.findById(service.getId());
    }
}
