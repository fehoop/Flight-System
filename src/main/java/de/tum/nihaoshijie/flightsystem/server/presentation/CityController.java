package de.tum.nihaoshijie.flightsystem.server.presentation;

import de.tum.nihaoshijie.flightsystem.common.model.CityModel;
import de.tum.nihaoshijie.flightsystem.server.business.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city")
    public CityModel getCity(@RequestParam("city") String name) {
        return cityService.getCityByName(name);
    }

}
