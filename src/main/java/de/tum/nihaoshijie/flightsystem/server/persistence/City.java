package de.tum.nihaoshijie.flightsystem.server.persistence;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String destribution;

    @ManyToOne
    @JoinColumn(name = "pois_id")
    private POI pois;

    public POI getPois() {
        return pois;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
