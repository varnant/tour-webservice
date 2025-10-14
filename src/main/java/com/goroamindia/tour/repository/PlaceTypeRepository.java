package com.goroamindia.tour.repository;

import com.goroamindia.tour.model.PlaceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceTypeRepository extends JpaRepository<PlaceType, Integer> {
}