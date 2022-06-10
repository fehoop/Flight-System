package de.tum.nihaoshijie.flightsystem.server.presentation;

import de.tum.nihaoshijie.flightsystem.server.business.InFlightServiceService;
import de.tum.nihaoshijie.flightsystem.server.persistence.inflightservice.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class InFlightServiceController {
    private InFlightServiceService inFlightServiceService;

    @Autowired
    public InFlightServiceController(InFlightServiceService inFlightServiceService) {
        this.inFlightServiceService = inFlightServiceService;
    }

    @GetMapping( "/inFlightService")
    public ResponseEntity<Optional<Service>> getInFlightService(@RequestBody Service service) {
        return ResponseEntity.ok(inFlightServiceService.getService(service));
    }
}
