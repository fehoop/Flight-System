package de.tum.nihaoshijie.flightsystem.server.persistence.inflightservice;

import java.util.HashSet;

public class Instruction extends Multimedia{
    private InstructionType instrctionType;

    public Instruction(Long id, String description,
                       HashSet<String> pictureUrls,
                       ServiceType serviceType, String name,
                       String url, InstructionType instrctionType) {
        super(id, description,pictureUrls, serviceType, name, url);
        this.instrctionType = instrctionType;
    }
}
