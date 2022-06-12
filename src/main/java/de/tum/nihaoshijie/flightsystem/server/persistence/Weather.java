package de.tum.nihaoshijie.flightsystem.server.persistence;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "weather")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date_time", nullable = false)
    private Instant dateTime;

    @Column(name = "city_id", length = 20)
    private String city;

    @Column(name = "weather_condition", length = 20)
    private String weatherCondition;

    @Column(name = "temperature", precision = 2, scale = 1)
    private BigDecimal temperature;

    @Column(name = "wind")
    private Integer wind;

    @Column(name = "humidity", precision = 3, scale = 2)
    private BigDecimal humidity;

    @Column(name = "rain", precision = 3, scale = 2)
    private BigDecimal rain;

    public BigDecimal getRain() {
        return rain;
    }

    public void setRain(BigDecimal rain) {
        this.rain = rain;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public Integer getWind() {
        return wind;
    }

    public void setWind(Integer wind) {
        this.wind = wind;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}