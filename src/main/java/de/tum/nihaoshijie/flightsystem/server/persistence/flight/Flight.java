package de.tum.nihaoshijie.flightsystem.server.persistence.flight;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate date;
    //???CITY not allowed??
    //private City origin;
    //private City destination;
    private LocalTime depatureTime;
    private LocalTime arrivalTime;
    private Long icao;
    private String airline;
    private String airlineType;
    private int terminal;
    private int gate;
    private Status status;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
