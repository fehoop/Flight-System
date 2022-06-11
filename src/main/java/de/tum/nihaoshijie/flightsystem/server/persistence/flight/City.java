package de.tum.nihaoshijie.flightsystem.server.persistence.flight;

import java.util.HashSet;

public class City {
    private String name;
    private String description;
    private HashSet<String> pictureUrls;
    private HashSet<POI> pois;
    private Weather weather;

    public City (String name, String description, HashSet<String> pictureUrls, HashSet<POI> pois, Weather weather) {
        this.name = name;
        this.description = description;
        this.pictureUrls = pictureUrls;
        this.pois = pois;
        this.weather = weather;
    }
}
