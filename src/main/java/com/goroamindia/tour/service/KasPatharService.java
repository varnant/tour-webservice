package com.goroamindia.tour.service;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.repository.PlaceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KasPatharService implements Hillstation {

    @Autowired
    private PlaceDetailsRepository repository;

    // Fetch Kas Pathar details from DB
    private PlaceDetails getKasPathar() {
        return repository.findByPlaceName("Kas Pathar")
                .stream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public String aboutPlace() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getDescription() != null)
                ? place.getDescription()
                : "";
    }

    @Override
    public String getNearByAirport() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getNearestAirport() != null)
                ? "Nearest Airport: " + place.getNearestAirport()
                : "";
    }

    @Override
    public String getNearByRailwayStation() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getNearestRailwayStation() != null)
                ? "Nearest Railway Station: " + place.getNearestRailwayStation()
                : "";
    }

    @Override
    public String getNearByCity() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getLocation() != null)
                ? "Nearby City: " + place.getLocation()
                : "";
    }

    @Override
    public String getNdearByTown() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getNearbyTown() != null)
                ? "Nearby Town: " + place.getNearbyTown()
                : "";
    }

    @Override
    public String getPlacestovisit() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getPlacesToVisit() != null)
                ? "Places to Visit: " + place.getPlacesToVisit()
                : "";
    }

    @Override
    public String getSeason() {
        PlaceDetails place = getKasPathar();
        return (place != null && place.getSeason() != null)
                ? "Best Season: " + place.getSeason()
                : "";
    }
}