package de.tum.nihaoshijie.flightsystem.server.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poi")
public abstract class POI {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    //todo: rate filter 10 best pois
    @Column
    private int rate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }
}
