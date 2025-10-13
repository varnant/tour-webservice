package com.goroamindia.tour.controller;

import com.goroamindia.tour.service.IgatpuriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/igatpuri")
public class IgatpuriController {

    @Autowired
    private IgatpuriService igatpuriService;

    @GetMapping("/about")
    public String aboutPlace() {
        return igatpuriService.aboutPlace();
    }

    @GetMapping("/religion")
    public String aboutReligion() {
        return igatpuriService.aboutRelgion();
    }

    @GetMapping("/airport")
    public String getNearByAirport() {
        return igatpuriService.getNearByAirport();
    }

    @GetMapping("/railway")
    public String getNearByRailwayStation() {
        return igatpuriService.getNearByRailwayStation();
    }

    @GetMapping("/city")
    public String getNearByCity() {
        return igatpuriService.getNearByCity();
    }

    @GetMapping("/town")
    public String getNearByTown() {
        return igatpuriService.getNdearByTown();
    }

    @GetMapping("/places")
    public String getPlacesToVisit() {
        return igatpuriService.getPlacestovisit();
    }

    @GetMapping("/season")
    public String getSeason() {
        return igatpuriService.getSeason();
    }
}