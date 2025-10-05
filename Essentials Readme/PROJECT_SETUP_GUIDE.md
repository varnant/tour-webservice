# Project Setup Guide for Trainees

## Initial Project Structure

```
tour-webservice/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── goroamindia/
│   │   │           └── tour/
│   │   │               ├── TourWebserviceApplication.java
│   │   │               ├── controller/
│   │   │               │   ├── PlaceController.java (common endpoints)
│   │   │               │   ├── MumbaiController.java
│   │   │               │   ├── PuneController.java
│   │   │               │   └── [YourPlaceController.java]
│   │   │               ├── model/
│   │   │               │   ├── PlaceDetails.java
│   │   │               │   ├── PlaceType.java
│   │   │               │   └── TravelInfo.java
│   │   │               ├── repository/
│   │   │               │   ├── PlaceDetailsRepository.java
│   │   │               │   └── PlaceTypeRepository.java
│   │   │               ├── service/
│   │   │               │   ├── PlaceService.java
│   │   │               │   └── [YourPlaceService.java]
│   │   │               └── config/
│   │   │                   └── DatabaseConfig.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql (optional)
│   └── test/
│       └── java/
│           └── com/
│               └── goroamindia/
│                   └── tour/
│                       └── controller/
│                           └── [YourPlaceControllerTest.java]
├── pom.xml
├── README.md
├── TRAINEE_ASSIGNMENTS.md
└── SqlQuery_Maharashtra_23_Places.sql
```

## Required Dependencies (pom.xml)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/>
    </parent>

    <groupId>com.goroamindia</groupId>
    <artifactId>tour-webservice</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>tour-webservice</name>
    <description>Maharashtra Tourism REST API</description>

    <properties>
        <java.version>17</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

## Application Configuration (application.properties)

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/tour_webservice
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Server Configuration
server.port=8080
server.servlet.context-path=/

# Logging
logging.level.com.goroamindia.tour=DEBUG
logging.level.org.springframework.web=INFO
```

## Sample Controller Template

```java
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
public class YourPlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/your-place-name")
    public ResponseEntity<PlaceDetails> getPlaceDetails() {
        try {
            PlaceDetails place = placeService.getPlaceByName("Your Place Name");
            return ResponseEntity.ok(place);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/your-place-name/attractions")
    public ResponseEntity<List<String>> getAttractions() {
        try {
            List<String> attractions = placeService.getAttractionsForPlace("Your Place Name");
            return ResponseEntity.ok(attractions);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/your-place-name/travel-info")
    public ResponseEntity<TravelInfo> getTravelInfo() {
        try {
            TravelInfo travelInfo = placeService.getTravelInfoForPlace("Your Place Name");
            return ResponseEntity.ok(travelInfo);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/your-place-name/weather")
    public ResponseEntity<String> getBestSeason() {
        try {
            String season = placeService.getBestSeasonForPlace("Your Place Name");
            return ResponseEntity.ok(season);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
```

## Sample Model Classes

### PlaceDetails.java

```java
package com.goroamindia.tour.model;

import jakarta.persistence.*;

@Entity
@Table(name = "places_details")
public class PlaceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placeId;

    @Column(name = "place_name")
    private String placeName;

    private String description;
    private String location;

    @Column(name = "google_location")
    private String googleLocation;

    @Column(name = "places_to_visit")
    private String placesToVisit;

    private String season;

    @Column(name = "crime_against_tourists")
    private String crimeAgainstTourists;

    @Column(name = "nearest_airport")
    private String nearestAirport;

    @Column(name = "nearest_railway_station")
    private String nearestRailwayStation;

    @ManyToOne
    @JoinColumn(name = "placetype")
    private PlaceType placeType;

    // Constructors, getters, and setters
}
```

### TravelInfo.java

```java
package com.goroamindia.tour.model;

public class TravelInfo {
    private String nearestAirport;
    private String nearestRailwayStation;
    private String bestSeason;
    private String safetyLevel;
    private String googleMapsLink;

    // Constructors, getters, and setters
}
```

## API Endpoints Each Trainee Should Implement

### For Your Assigned Place:

1. `GET /api/places/{your-place-name}` - Get complete place details
2. `GET /api/places/{your-place-name}/attractions` - Get list of attractions
3. `GET /api/places/{your-place-name}/travel-info` - Get travel information
4. `GET /api/places/{your-place-name}/weather` - Get best season to visit

### Example URLs:

- Mumbai trainee: `/api/places/mumbai`, `/api/places/mumbai/attractions`
- Pune trainee: `/api/places/pune`, `/api/places/pune/attractions`
- Mahabaleshwar trainee: `/api/places/mahabaleshwar`, `/api/places/mahabaleshwar/attractions`

## Testing Your API

### Using curl:

```bash
curl http://localhost:8080/api/places/mumbai
curl http://localhost:8080/api/places/mumbai/attractions
curl http://localhost:8080/api/places/mumbai/travel-info
```

### Using Postman:

1. Create a new request
2. Set method to GET
3. Enter URL: `http://localhost:8080/api/places/your-place-name`
4. Send request and verify JSON response

## Deployment to goroamindia.com

- All controllers will be integrated into a single Spring Boot application
- Each trainee's controller will handle their specific place
- The application will be deployed to goroamindia.com
- Database will be hosted on cloud (MySQL)

## Git Workflow

1. Clone the repository
2. Create a branch: `git checkout -b feature/your-place-name`
3. Implement your controller
4. Commit changes: `git commit -m "Add YourPlace controller"`
5. Push branch: `git push origin feature/your-place-name`
6. Create Pull Request
7. After review, merge to main branch
