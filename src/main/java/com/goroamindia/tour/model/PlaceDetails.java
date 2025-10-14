package com.goroamindia.tour.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "places_details")
public class PlaceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer placeId;

    private String placeName;
    @Column(length = 1000)
    private String description;
    private String location;
    private String googleLocation;

    @Column(length = 1000)
    private String placesToVisit;
    private String season;
    private String crimeAgainstTourists;
    private String nearestAirport;
    private String nearestRailwayStation;

    private Integer placetype;

   
    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
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