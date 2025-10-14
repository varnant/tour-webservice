package com.goroamindia.tour.cotroller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.goroamindia.tour.service.ThosegharFallService;

@RestController
@RequestMapping("/api/thosegharfalls")
public class ThosegharFallsController {

    @Autowired
    private ThosegharFallService thosegharFallService;

    @GetMapping("/about")
    public String aboutPlace() {
        return thosegharFallService.aboutPlace();
    }

    @GetMapping("/religion")
    public String aboutReligion() {
        return thosegharFallService.aboutRelgion();
    }

    @GetMapping("/airport")
    public String getNearByAirport() {
        return thosegharFallService.getNearByAirport();
    }

    @GetMapping("/railway")
    public String getNearByRailwayStation() {
        return thosegharFallService.getNearByRailwayStation();
    }

    @GetMapping("/city")
    public String getNearByCity() {
        return thosegharFallService.getNearByCity();
    }

    @GetMapping("/town")
    public String getNearByTown() {
        return thosegharFallService.getNdearByTown();
    }

    @GetMapping("/places")
    public String getPlacesToVisit() {
        return thosegharFallService.getPlacestovisit();
    }

    @GetMapping("/season")
    public String getSeason() {
        return thosegharFallService.getSeason();
    }
}