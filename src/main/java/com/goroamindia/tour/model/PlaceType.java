package com.goroamindia.tour.model;

import jakarta.persistence.*;

@Entity
@Table(name = "placetype")
public class PlaceType {
    
    @Id
    @Column(name = "refid")
    private Integer refId;
    
    @Column(name = "place_type")
    private String placeType;

    // Constructors
    public PlaceType() {}

    public PlaceType(Integer refId, String placeType) {
        this.refId = refId;
        this.placeType = placeType;
    }

    // Getters and Setters
    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }
}