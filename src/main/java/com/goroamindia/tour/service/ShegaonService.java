package com.goroamindia.tour.service;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.repository.PlaceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShegaonService implements Religious {

    @Autowired
    private PlaceDetailsRepository repository;

    private PlaceDetails getShegaon() {
        return repository.findByPlaceName("Shegaon Gajanan Maharaj Temple")
                .stream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public String aboutPlace() {
        return getShegaon().getDescription();
    }

    @Override
    public String aboutRelgion() {
        return "Associated with the Hindu religion, devoted to Shri Gajanan Maharaj.";
    }

    @Override
    public String getNearByAirport() {
        return "Nearest Airport: " + getShegaon().getNearestAirport();
    }

    @Override
    public String getNearByRailwayStation() {
        return "Nearest Railway Station: " + getShegaon().getNearestRailwayStation();
    }

    @Override
    public String getNearByCity() {
        return "Nearby City: Akola (~60 km)";
    }

    @Override
    public String getNdearByTown() {
        return "Nearby Town: Khamgaon (~20 km)";
    }

    @Override
    public String getPlacestovisit() {
        return "Places to Visit: " + getShegaon().getPlacesToVisit();
    }

    @Override
    public String getSeason() {
        return "Best Season: " + getShegaon().getSeason();
    }
}
