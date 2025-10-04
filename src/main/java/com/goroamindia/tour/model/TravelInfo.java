package com.goroamindia.tour.model;

public class TravelInfo {
    private String nearestAirport;
    private String nearestRailwayStation;
    private String bestSeason;
    private String safetyLevel;
    public TravelInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TravelInfo(String nearestAirport, String nearestRailwayStation, String bestSeason, String safetyLevel,
			String googleMapsLink) {
		super();
		this.nearestAirport = nearestAirport;
		this.nearestRailwayStation = nearestRailwayStation;
		this.bestSeason = bestSeason;
		this.safetyLevel = safetyLevel;
		this.googleMapsLink = googleMapsLink;
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
	public String getBestSeason() {
		return bestSeason;
	}
	public void setBestSeason(String bestSeason) {
		this.bestSeason = bestSeason;
	}
	public String getSafetyLevel() {
		return safetyLevel;
	}
	public void setSafetyLevel(String safetyLevel) {
		this.safetyLevel = safetyLevel;
	}
	public String getGoogleMapsLink() {
		return googleMapsLink;
	}
	public void setGoogleMapsLink(String googleMapsLink) {
		this.googleMapsLink = googleMapsLink;
	}
	private String googleMapsLink;

    // Constructors, getters, and setters
}