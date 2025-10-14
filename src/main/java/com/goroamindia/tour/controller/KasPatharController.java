package com.goroamindia.tour.controller;

import com.goroamindia.tour.service.KasPatharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kaspathar")
public class KasPatharController {

    @Autowired
    private KasPatharService kasPatharService;

    @GetMapping("/about")
    public String aboutPlace() {
        return kasPatharService.aboutPlace();
    }
    
    @GetMapping("/airport")
    public String getNearByAirport() {
        return kasPatharService.getNearByAirport();
    }

    @GetMapping("/railway")
    public String getNearByRailwayStation() {
        return kasPatharService.getNearByRailwayStation();
    }

    @GetMapping("/city")
    public String getNearByCity() {
        return kasPatharService.getNearByCity();
    }

    @GetMapping("/town")
    public String getNearByTown() {
        return kasPatharService.getNdearByTown();
    }

    @GetMapping("/places")
    public String getPlacesToVisit() {
        return kasPatharService.getPlacestovisit();
    }

    @GetMapping("/season")
    public String getSeason() {
        return kasPatharService.getSeason();
    }
}