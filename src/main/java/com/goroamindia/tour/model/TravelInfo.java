package com.goroamindia.tour.model;

public class TravelInfo {

    private String nearestAirport;
    private String nearestRailwayStation;
    private String crimeAgainstTourists;

    // Constructors
    public TravelInfo() {}

    public TravelInfo(String nearestAirport, String nearestRailwayStation, String crimeAgainstTourists) {
        this.nearestAirport = nearestAirport;
        this.nearestRailwayStation = nearestRailwayStation;
        this.crimeAgainstTourists = crimeAgainstTourists;
    }

    // Getters and Setters
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

    public String getCrimeAgainstTourists() {
        return crimeAgainstTourists;
    }

    public void setCrimeAgainstTourists(String crimeAgainstTourists) {
        this.crimeAgainstTourists = crimeAgainstTourists;
    }
}
