package de.tum.nihaoshijie.flightsystem.server.business;

import de.tum.nihaoshijie.flightsystem.server.persistence.POI;
import de.tum.nihaoshijie.flightsystem.server.repository.POIRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class POIService {
    private POIRepository poiRepository;

    public POIService(POIRepository poiRepository) {
        this.poiRepository = poiRepository;
    }

    public List<POI> findAll() {
        List<POI> pois = new ArrayList<POI>();
        poiRepository.findAll().forEach(poi -> pois.add(poi));
        return pois;
    }
    //todo:implement filterTenBestPOIs in this class ???
    public List<POI> filterTenBestPOIs() {
        List<POI> pois = new ArrayList<POI>();
        poiRepository.findAll().forEach(poi -> pois.add(poi));
        List<POI> sortedPOIs = pois.stream().sorted(Comparator.comparing(POI::getRate).reversed()).collect(Collectors.toList());
        List<POI> bestPOIs = sortedPOIs.size()>10? sortedPOIs.stream().limit(10).collect(Collectors.toList()) : sortedPOIs;
        return bestPOIs;
    }

    public void saveOrUpdatePOI(POI poi)
    {
        poiRepository.save(poi);
    }

    public void deletePOI(long id)
    {
        poiRepository.deleteById(id);
    }

}
