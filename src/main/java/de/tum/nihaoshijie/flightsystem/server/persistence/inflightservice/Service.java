package de.tum.nihaoshijie.flightsystem.server.persistence.inflightservice;

import java.util.HashSet;

public abstract class Service {
    private Long id;
    private String description;
    private HashSet<String> pictureUrls;
    private ServiceType serviceType;

    public Service (Long id, String description,HashSet<String> pictureUrls, ServiceType serviceType) {
        this.id = id;
        this.description = description;
        this.pictureUrls = pictureUrls;
        this.serviceType = serviceType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<String> getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(HashSet<String> pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
