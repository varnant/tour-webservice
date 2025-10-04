package com.goroamindia.tour.repository;

import com.goroamindia.tour.model.PlaceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaceDetailsRepository extends JpaRepository<PlaceDetails, Long> {
    
    // Find by exact place name
    Optional<PlaceDetails> findByPlaceName(String placeName);
    
    // Find by place name ignoring case
    Optional<PlaceDetails> findByPlaceNameIgnoreCase(String placeName);
    
    // Find all places by type
    List<PlaceDetails> findByPlacetype(Integer placeType);
    
    // Search places by name containing (for partial matches)
    List<PlaceDetails> findByPlaceNameContainingIgnoreCase(String placeName);
    
    // Custom query to find places by season
    @Query("SELECT p FROM PlaceDetails p WHERE p.season LIKE %:season%")
    List<PlaceDetails> findPlacesBySeason(@Param("season") String season);
    
    // Custom query to find places with specific location
    @Query("SELECT p FROM PlaceDetails p WHERE p.location LIKE %:location%")
    List<PlaceDetails> findPlacesByLocation(@Param("location") String location);
}