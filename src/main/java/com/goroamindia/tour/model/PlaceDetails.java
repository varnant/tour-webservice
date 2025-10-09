package com.goroamindia.tour.model;

public class PlaceDetails {

    private Integer placeId;
    private String placeName;
    private String description;
    private String location;
    private String googleLocation;
    private String placesToVisit;
    private String season;

    // Constructors
    public PlaceDetails() {}

    public PlaceDetails(Integer placeId, String placeName, String description, String location, String googleLocation, String placesToVisit, String season) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.description = description;
        this.location = location;
        this.googleLocation = googleLocation;
        this.placesToVisit = placesToVisit;
        this.season = season;
    }

    // Getters and Setters
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
}
