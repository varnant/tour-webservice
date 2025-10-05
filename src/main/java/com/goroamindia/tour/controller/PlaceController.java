package com.goroamindia.tour.controller;

import com.goroamindia.tour.model.PlaceDetails;
import com.goroamindia.tour.model.TravelInfo;
import com.goroamindia.tour.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/places")
@CrossOrigin(origins = "*")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/{placeName}")
    public ResponseEntity<PlaceDetails> getPlaceDetails(@PathVariable String placeName) {
        try {
            PlaceDetails place = placeService.getPlaceByName(placeName);
            return ResponseEntity.ok(place);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{placeName}/attractions")
    public ResponseEntity<List<String>> getAttractions(@PathVariable String placeName) {
        try {
            List<String> attractions = placeService.getAttractionsForPlace(placeName);
            return ResponseEntity.ok(attractions);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{placeName}/travel-info")
    public ResponseEntity<TravelInfo> getTravelInfo(@PathVariable String placeName) {
        try {
            TravelInfo travelInfo = placeService.getTravelInfoForPlace(placeName);
            return ResponseEntity.ok(travelInfo);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{placeName}/weather")
    public ResponseEntity<String> getBestSeason(@PathVariable String placeName) {
        try {
            String season = placeService.getBestSeasonForPlace(placeName);
            return ResponseEntity.ok(season);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
