package tourwebservice.Tourwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tourwebservice.Tourwebservice.model.PlaceDetails;

import java.util.List;

@Repository
public interface PlaceDetailsRepository extends JpaRepository<PlaceDetails, Integer> {
    List<PlaceDetails> findByPlaceName(String placeName);
    List<PlaceDetails> findByPlacetype(Integer placetype);
}
