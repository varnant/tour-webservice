package tourwebservice.Tourwebservice.controller;



	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

import tourwebservice.Tourwebservice.service.HarishchandraService;

	@RestController
	@RequestMapping("/api/harishchandra")
	public class HarishchandraController {

	    @Autowired
	    private HarishchandraService harishchandraService;

	    @GetMapping("/about")
	    public String aboutPlace() {
	        return harishchandraService.aboutPlace();
	    }

	    @GetMapping("/religion")
	    public String aboutReligion() {
	        return harishchandraService.aboutRelgion();
	    }

	    @GetMapping("/airport")
	    public String getNearByAirport() {
	        return harishchandraService.getNearByAirport();
	    }

	    @GetMapping("/railway")
	    public String getNearByRailwayStation() {
	        return harishchandraService.getNearByRailwayStation();
	    }

	    @GetMapping("/city")
	    public String getNearByCity() {
	        return harishchandraService.getNearByCity();
	    }

	    @GetMapping("/town")
	    public String getNearByTown() {
	        return harishchandraService.getNdearByTown();
	    }

	    @GetMapping("/places")
	    public String getPlacesToVisit() {
	        return harishchandraService.getPlacestovisit();
	    }

	    @GetMapping("/season")
	    public String getSeason() {
	        return harishchandraService.getSeason();
	    }
	}

