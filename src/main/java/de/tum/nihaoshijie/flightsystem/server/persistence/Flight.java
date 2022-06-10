package de.tum.nihaoshijie.flightsystem.server.persistence;

import javax.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @OneToOne
    @JoinColumn(name = "origin_id")
    private City origin;

    @OneToOne
    @JoinColumn(name = "destination_id")
    private City destination;



    public City getDestination() {
        return destination;
    }


    public City getOrigin() {
        return origin;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
