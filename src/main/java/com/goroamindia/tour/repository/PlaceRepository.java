package com.goroamindia.tour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goroamindia.tour.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    // Get places by placetype (Integer field)
    List<Place> findByPlacetype(Integer placetype);

    // Search by partial name (case-insensitive)
    List<Place> findByPlaceNameContainingIgnoreCase(String placeName);

    // Search by exact name (case-insensitive for better usability)
    List<Place> findByPlaceNameIgnoreCase(String placeName);
}
