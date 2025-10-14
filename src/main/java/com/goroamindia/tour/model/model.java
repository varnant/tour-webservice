package com.goroamindia.tour.model;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	public class model {
	@Entity
	@Table(name = "placetype")
	public class PlaceType {

	    @Id
	    private Integer refid;
	    private String placeType;

	    // Getters and Setters
	    public Integer getRefid() {
	        return refid;
	    }

	    public void setRefid(Integer refid) {
	        this.refid = refid;
	    }

	    public String getPlaceType() {
	        return placeType;
	    }

	    public void setPlaceType(String placeType) {
	        this.placeType = placeType;
	    }
	}
}
