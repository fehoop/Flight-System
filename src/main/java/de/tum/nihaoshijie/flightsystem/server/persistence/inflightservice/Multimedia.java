package de.tum.nihaoshijie.flightsystem.server.persistence.inflightservice;

import java.util.HashSet;

public class Multimedia extends Service {
    private String name;
    private String url;

    public Multimedia (Long id, String description, HashSet<String> pictureUrls, ServiceType serviceType, String name, String url) {
        super(id, description,pictureUrls, serviceType);
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
