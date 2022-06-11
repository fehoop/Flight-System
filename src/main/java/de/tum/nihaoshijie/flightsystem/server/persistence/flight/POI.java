package de.tum.nihaoshijie.flightsystem.server.persistence.flight;

import java.util.HashSet;

public class POI {
    private POIType poiType;
    private Coordinate coordinate;
    private String address;
    private String description;
    private HashSet<String> pictureUrls;
}
