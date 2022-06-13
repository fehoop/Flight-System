package de.tum.nihaoshijie.flightsystem.server.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "de.tum.nihaoshijie.flightsystem.server")
@EnableJpaRepositories(basePackages = "de.tum.nihaoshijie.flightsystem.server.repository")
public class FlightSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlightSystemApplication.class, args);
    }

}
