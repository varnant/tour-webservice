package com.goroamindia.tour.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goroamindia.tour.model.model.PlaceType;

@Repository
public interface PlaceTypeRepository extends JpaRepository<PlaceType, Integer> {
}