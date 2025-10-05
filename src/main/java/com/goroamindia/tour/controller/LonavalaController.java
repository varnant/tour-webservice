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
public class LonavalaController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/Lonavala")
    public ResponseEntity<PlaceDetails> getPlaceDetails() {
        try {
            PlaceDetails place = placeService.getPlaceByName("Lonavala");
            return ResponseEntity.ok(place);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Lonavala/attractions")
    public ResponseEntity<List<String>> getAttractions() {
        try {
            List<String> attractions = placeService.getAttractionsForPlace("Lonavala");
            return ResponseEntity.ok(attractions);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Lonavala/travel-info")
    public ResponseEntity<TravelInfo> getTravelInfo() {
        try {
            TravelInfo travelInfo = placeService.getTravelInfoForPlace("Lonavala");
            return ResponseEntity.ok(travelInfo);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Lonavala/weather")
    public ResponseEntity<String> getBestSeason() {
        try {
            String season = placeService.getBestSeasonForPlace("Lonavala");
            return ResponseEntity.ok(season);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
