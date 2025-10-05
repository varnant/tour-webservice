package com.goroamindia.tour.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.goroamindia.tour.model.Place;
import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.model.TravelInfo;
import com.goroamindia.tour.repository.PlaceRepository;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    // Get all places
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    // Get place by ID
    public Optional<Place> getPlaceById(Integer id) {
        return placeRepository.findById(id);
    }

    // Get places by type (placetype column)
    public List<Place> getPlacesByType(Integer typeId) {
        return placeRepository.findByPlacetype(typeId);
    }

    // Search places by name (case-insensitive, partial match)
    public List<Place> searchPlacesByName(String name) {
        return placeRepository.findByPlaceNameContainingIgnoreCase(name);
    }

    // Search place by exact name (case-insensitive)
    public Optional<Place> getPlaceByExactName(String name) {
        List<Place> results = placeRepository.findByPlaceNameIgnoreCase(name);
        return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
    }

    // New method: getPlaceByName returning PlaceDetails
    public PlaceDetails getPlaceByName(String placeName) throws Exception {
        Optional<Place> placeOpt = getPlaceByExactName(placeName);
        if (placeOpt.isEmpty()) {
            throw new Exception("Place not found: " + placeName);
        }
        Place place = placeOpt.get();
        return new PlaceDetails(
            place.getPlaceId(),
            place.getPlaceName(),
            place.getDescription(),
            place.getLocation(),
            place.getGoogleLocation(),
            place.getPlacesToVisit(),
            place.getSeason()
        );
    }

    // New method: getAttractionsForPlace returning List<String>
    public List<String> getAttractionsForPlace(String placeName) throws Exception {
        Optional<Place> placeOpt = getPlaceByExactName(placeName);
        if (placeOpt.isEmpty()) {
            throw new Exception("Place not found: " + placeName);
        }
        Place place = placeOpt.get();
        String placesToVisit = place.getPlacesToVisit();
        if (placesToVisit == null || placesToVisit.isEmpty()) {
            return new ArrayList<>();
        }
        // Assuming placesToVisit is a comma-separated string of attractions
        String[] attractionsArray = placesToVisit.split(",");
        List<String> attractions = new ArrayList<>();
        for (String attraction : attractionsArray) {
            attractions.add(attraction.trim());
        }
        return attractions;
    }

    // New method: getTravelInfoForPlace returning TravelInfo
    public TravelInfo getTravelInfoForPlace(String placeName) throws Exception {
        Optional<Place> placeOpt = getPlaceByExactName(placeName);
        if (placeOpt.isEmpty()) {
            throw new Exception("Place not found: " + placeName);
        }
        Place place = placeOpt.get();
        return new TravelInfo(
            place.getNearestAirport(),
            place.getNearestRailwayStation(),
            place.getCrimeAgainstTourists()
        );
    }

    // Updated method: getBestSeasonForPlace returning String
    public String getBestSeasonForPlace(String placeName) throws Exception {
        Optional<Place> placeOpt = getPlaceByExactName(placeName);
        if (placeOpt.isEmpty()) {
            throw new Exception("Place not found: " + placeName);
        }
        Place place = placeOpt.get();
        return place.getSeason() != null ? place.getSeason() : "Season information not available";
    }
}
