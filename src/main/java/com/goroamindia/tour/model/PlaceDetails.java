package com.goroamindia.tour.model;

import jakarta.persistence.*;

@Entity
@Table(name = "places_details")
public class PlaceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Integer placeId; // Changed from Long to Integer

    @Column(name = "place_name")
    private String placeName;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String location;

    @Column(name = "google_location")
    private String googleLocation;

    @Column(name = "places_to_visit", columnDefinition = "TEXT")
    private String placesToVisit;

    private String season;

    @Column(name = "crime_against_tourists")
    private String crimeAgainstTourists;

    @Column(name = "nearest_airport")
    private String nearestAirport;

    @Column(name = "nearest_railway_station")
    private String nearestRailwayStation;

    @Column(name = "placetype")
    private Integer placetype;

    // Constructors
    public PlaceDetails() {}

    public PlaceDetails(String placeName, String description, String location) {
        this.placeName = placeName;
        this.description = description;
        this.location = location;
    }

    // Getters and Setters
    public Integer getPlaceId() { // Changed from Long to Integer
        return placeId;
    }

    public void setPlaceId(Integer placeId) { // Changed from Long to Integer
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGoogleLocation() {
        return googleLocation;
    }

    public void setGoogleLocation(String googleLocation) {
        this.googleLocation = googleLocation;
    }

    public String getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(String placesToVisit) {
        this.placesToVisit = placesToVisit;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCrimeAgainstTourists() {
        return crimeAgainstTourists;
    }

    public void setCrimeAgainstTourists(String crimeAgainstTourists) {
        this.crimeAgainstTourists = crimeAgainstTourists;
    }

    public String getNearestAirport() {
        return nearestAirport;
    }

    public void setNearestAirport(String nearestAirport) {
        this.nearestAirport = nearestAirport;
    }

    public String getNearestRailwayStation() {
        return nearestRailwayStation;
    }

    public void setNearestRailwayStation(String nearestRailwayStation) {
        this.nearestRailwayStation = nearestRailwayStation;
    }

    public Integer getPlacetype() {
        return placetype;
    }

    public void setPlacetype(Integer placetype) {
        this.placetype = placetype;
    }
}