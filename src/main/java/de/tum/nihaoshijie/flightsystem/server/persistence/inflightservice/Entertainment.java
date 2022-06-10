package de.tum.nihaoshijie.flightsystem.server.persistence.inflightservice;

import java.util.HashSet;

public class Entertainment extends Multimedia{
    private EntertainmentType entertainmentType;

    public Entertainment(Long id, String description,
                         HashSet<String> pictureUrls,
                         ServiceType serviceType,
                         String name, String url, EntertainmentType entertainmentType) {
        super(id, description,pictureUrls, serviceType, name, url);
        this.entertainmentType = entertainmentType;
    }
}
