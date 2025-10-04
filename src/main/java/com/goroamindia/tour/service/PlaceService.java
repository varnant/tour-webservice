package com.goroamindia.tour.service;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.model.TravelInfo;

import java.util.List;

public interface PlaceService {
    PlaceDetails getPlaceByName(String placeName);
    List<String> getAttractionsForPlace(String placeName);
    TravelInfo getTravelInfoForPlace(String placeName);
    String getBestSeasonForPlace(String placeName);
}