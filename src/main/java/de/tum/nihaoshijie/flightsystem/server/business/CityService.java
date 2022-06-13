package de.tum.nihaoshijie.flightsystem.server.business;

import de.tum.nihaoshijie.flightsystem.common.model.CityModel;
import de.tum.nihaoshijie.flightsystem.common.model.PoiModel;
import de.tum.nihaoshijie.flightsystem.server.persistence.City;
import de.tum.nihaoshijie.flightsystem.server.persistence.Poi;
import de.tum.nihaoshijie.flightsystem.server.repository.CityRepository;
import de.tum.nihaoshijie.flightsystem.server.repository.PoiRepository;
import de.tum.nihaoshijie.flightsystem.server.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private CityRepository cityRepository;
    private PoiRepository poiRepository;
    private WeatherRepository weatherRepository;

    @Autowired
    public CityService(CityRepository cityRepository, PoiRepository poiRepository, WeatherRepository weatherRepository) {
        this.cityRepository = cityRepository;
        this.poiRepository = poiRepository;
        this.weatherRepository = weatherRepository;
    }

    public CityModel getCityByName(String name) {
        final List<City> cities = cityRepository.findCityByName(name);
        // TODO: remove duplicate if existing
        // TODO: convert entity to object
        return null;
    }

    public List<PoiModel> getPoisByCity(String name) {
        // TODO: get city
        // TODO: find pois by city id
        return null;
    }

    public List<PoiModel> getTopTenPois(String name) {
        // TODO: get pois
        // TODO: sort by rate
        // TODO: find top ten+
        return null;
    }
}
