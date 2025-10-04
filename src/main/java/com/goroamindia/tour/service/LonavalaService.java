package com.goroamindia.tour.service;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.model.TravelInfo;
import com.goroamindia.tour.repository.PlaceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LonavalaService implements PlaceService {

    @Autowired
    private PlaceDetailsRepository placeDetailsRepository;

    @Override
    public PlaceDetails getPlaceByName(String placeName) {
        // First try exact match
        Optional<PlaceDetails> place = placeDetailsRepository.findByPlaceName(placeName);
        
        // If not found, try case-insensitive match
        if (place.isEmpty()) {
            place = placeDetailsRepository.findByPlaceNameIgnoreCase(placeName);
        }
        
        return place.orElse(null);
    }

    @Override
    public List<String> getAttractionsForPlace(String placeName) {
        PlaceDetails place = getPlaceByName(placeName);
        if (place != null && place.getPlacesToVisit() != null) {
            // Split the comma-separated places to visit into a list
            return Arrays.asList(place.getPlacesToVisit().split(",\\s*"));
        }
        
        // Return empty list if not found in database
        return Arrays.asList();
    }

    @Override
    public TravelInfo getTravelInfoForPlace(String placeName) {
        PlaceDetails place = getPlaceByName(placeName);
        if (place != null) {
            TravelInfo travelInfo = new TravelInfo();
            travelInfo.setNearestAirport(place.getNearestAirport());
            travelInfo.setNearestRailwayStation(place.getNearestRailwayStation());
            travelInfo.setBestSeason(place.getSeason());
            travelInfo.setSafetyLevel(place.getCrimeAgainstTourists());
            travelInfo.setGoogleMapsLink(place.getGoogleLocation());
            return travelInfo;
        }
        
        // Return null if place not found
        return null;
    }

    @Override
    public String getBestSeasonForPlace(String placeName) {
        PlaceDetails place = getPlaceByName(placeName);
        if (place != null && place.getSeason() != null) {
            return "Best time to visit " + placeName + ": " + place.getSeason();
        }
        
        
        return null;
    }
}