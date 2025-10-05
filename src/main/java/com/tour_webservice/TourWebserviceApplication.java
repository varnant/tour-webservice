package com.tour_webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.goroamindia", "com.tour_webservice"})
@EntityScan(basePackages = "com.goroamindia.tour.model")
@EnableJpaRepositories(basePackages = "com.goroamindia.tour.repository")
public class TourWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourWebserviceApplication.class, args);
	}

}
