package com.goroamindia.tour.service;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.repository.PlaceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IgatpuriService implements Religious {

    @Autowired
    private PlaceDetailsRepository repository;

    private PlaceDetails getigatpuri() {
        return repository.findByPlaceName("Igatpuri")
                .stream()
                .findFirst()
                .orElseGet(() -> {
                    PlaceDetails fallback = new PlaceDetails();
                    fallback.setDescription("No data found for Igatpuri");
                    return fallback;
                });
    }

    @Override
    public String aboutPlace() {
        return getigatpuri().getDescription();
    }

    @Override
    public String aboutRelgion() {
        return "Hill station with Vipassana centre and waterfalls";
    }

    @Override
    public String getNearByAirport() {
        return "Nearest Airport: " + getigatpuri().getNearestAirport();
    }

    @Override
    public String getNearByRailwayStation() {
        return "Nearest Railway Station: " + getigatpuri().getNearestRailwayStation();
    }

    @Override
    public String getNearByCity() {
        return "Nashik";
    }

    @Override
    public String getNdearByTown() {
        return "Igatpuri";
    }

    @Override
    public String getPlacestovisit() {
        return "Places to Visit: " + getigatpuri().getPlacesToVisit();
    }

    @Override
    public String getSeason() {
        return "Best Season: " + getigatpuri().getSeason();
    }
}