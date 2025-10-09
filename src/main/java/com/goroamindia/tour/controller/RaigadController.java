package com.goroamindia.tour.controller;

import com.goroamindia.tour.model.Place;
import com.goroamindia.tour.service.PlaceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/raigad")
public class RaigadController {

    private final PlaceService placeService;

    public RaigadController(PlaceService placeService) {
        this.placeService = placeService;
    }

    // Test endpoint to confirm controller is loaded
    @GetMapping("/test")
    public String test() {
        return "RaigadController is working!";
    }

    // GET /api/raigad → returns Raigad details
    @GetMapping
    public ResponseEntity<Place> getRaigadDetails() {
        return getRaigadByName();
    }
 
    // GET /api/raigad/{id} → returns place by ID
    @GetMapping("/{id}")
    public ResponseEntity<Place> getPlaceById(@PathVariable Integer id) {
        return placeService.getPlaceById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    System.out.println("Place not found with ID: " + id + ". Falling back to Raigad by name.");
                    return getRaigadByName();
                });
    }

    // Helper method to get Raigad by correct spelling
    private ResponseEntity<Place> getRaigadByName() {
        List<Place> results = placeService.searchPlacesByName("Raigad"); // Fixed spelling
        if (results.isEmpty()) {
            System.out.println("Raigad not found in database!");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(results.get(0));
    }
}
