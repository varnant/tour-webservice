package com.goroamindia.tour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.repository.PlaceDetailsRepository;

@Service
public class ThosegharFallService implements Religious {

    @Autowired
    private PlaceDetailsRepository repository;

    private PlaceDetails getThosegharFall() {
        return repository.findByPlaceName("Thoseghar Waterfall")
                .stream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public String aboutPlace() {
        PlaceDetails place = getThosegharFall();
        if (place != null && place.getDescription() != null) {
            return place.getDescription();
        }
        return "Thoseghar Waterfall is a scenic natural waterfall located near Satara in Maharashtra. " +
                "It is known for its series of waterfalls with heights ranging from 15 to 500 feet, " +
                "surrounded by lush green hills and dense forests. The area becomes particularly beautiful " +
                "during the monsoon season, attracting tourists and nature enthusiasts.";
    }

    @Override
    public String aboutRelgion() {
        return "Thoseghar Falls itself is a natural attraction, not directly associated with any religion. " +
                "However, the nearby region of Satara has many temples and pilgrimage sites related to Hinduism, " +
                "such as the Sajjangad Fort (associated with Saint Ramdas Swami).";
    }

    @Override
    public String getNearByAirport() {
        PlaceDetails place = getThosegharFall();
        if (place != null && place.getNearestAirport() != null) {
            return "Nearest Airport: " + place.getNearestAirport();
        }
        return "Nearest Airport: Pune International Airport (~140 km from Thoseghar).";
    }

    @Override
    public String getNearByRailwayStation() {
        PlaceDetails place = getThosegharFall();
        if (place != null && place.getNearestRailwayStation() != null) {
            return "Nearest Railway Station: " + place.getNearestRailwayStation();
        }
        return "Nearest Railway Station: Satara Railway Station (~20 km from Thoseghar).";
    }

    @Override
    public String getNearByCity() {
        return "Nearby City: Satara (~20 km from Thoseghar Waterfall).";
    }

    @Override
    public String getNdearByTown() {
        return "Nearby Town: Kas (famous for Kas Plateau or Valley of Flowers, ~15 km from Thoseghar).";
    }

    @Override
    public String getPlacestovisit() {
        PlaceDetails place = getThosegharFall();
        if (place != null && place.getPlacesToVisit() != null) {
            return "Places to Visit: " + place.getPlacesToVisit();
        }
        return "Places to Visit: Kas Plateau (Valley of Flowers), Sajjangad Fort, Chalkewadi Windmill Farms, " +
                "Ajinkyatara Fort, and Kaas Lake.";
    }

    @Override
    public String getSeason() {
        PlaceDetails place = getThosegharFall();
        if (place != null && place.getSeason() != null) {
            return "Best Season: " + place.getSeason();
        }
        return "Best Season: Monsoon (June to September) — the waterfalls are at their fullest and most beautiful.";
    }
}
