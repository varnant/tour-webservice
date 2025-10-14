package tourwebservice.Tourwebservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tourwebservice.Tourwebservice.model.PlaceType;

@Repository
public interface PlaceTypeRepository extends JpaRepository<PlaceType, Integer> {
}
