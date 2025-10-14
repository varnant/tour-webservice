package com.goroamindia.tour.controller;

import com.goroamindia.tour.service.ShegaonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shegaon")
public class ShegaonController {

    @Autowired
    private ShegaonService shegaonService;

    @GetMapping("/about")
    public String aboutPlace() {
        return shegaonService.aboutPlace();
    }

    @GetMapping("/religion")
    public String aboutReligion() {
        return shegaonService.aboutRelgion();
    }

    @GetMapping("/airport")
    public String getNearByAirport() {
        return shegaonService.getNearByAirport();
    }

    @GetMapping("/railway")
    public String getNearByRailwayStation() {
        return shegaonService.getNearByRailwayStation();
    }

    @GetMapping("/city")
    public String getNearByCity() {
        return shegaonService.getNearByCity();
    }

    @GetMapping("/town")
    public String getNearByTown() {
        return shegaonService.getNdearByTown();
    }

    @GetMapping("/places")
    public String getPlacesToVisit() {
        return shegaonService.getPlacestovisit();
    }

    @GetMapping("/season")
    public String getSeason() {
        return shegaonService.getSeason();
    }
}
