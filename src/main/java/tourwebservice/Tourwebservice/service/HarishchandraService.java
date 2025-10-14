package tourwebservice.Tourwebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourwebservice.Tourwebservice.model.PlaceDetails;
import tourwebservice.Tourwebservice.repository.PlaceDetailsRepository;

@Service
public class HarishchandraService implements Religious {

    @Autowired
    private PlaceDetailsRepository repository;

    // --- Helper Method ---
    private PlaceDetails getHarishchandra() {
        PlaceDetails place = repository.findByPlaceName("Harishchandra Ghat")
                .stream()
                .findFirst()
                .orElse(null);

        // If not found in DB, return default hardcoded info
        if (place == null) {
            place = new PlaceDetails();
            place.setPlaceName("Harishchandra Ghat");
            place.setDescription(
                    "Harishchandra Ghat is one of the oldest and most sacred ghats in Varanasi, located on the banks of the River Ganga. "
                    + "It is named after the legendary King Harishchandra, who is said to have once worked at the cremation ground here "
                    + "to uphold truth and righteousness. The ghat is a major site for Hindu cremation rituals and is considered highly sacred "
                    + "for attaining moksha (liberation). A steady stream of devotees visit the ghat to perform last rites and to witness the eternal "
                    + "flame that has been burning continuously for centuries."
            );
            place.setNearestAirport("Lal Bahadur Shastri International Airport, Varanasi (~25 km)");
            place.setNearestRailwayStation("Varanasi Junction (Kashi Station) (~5 km)");
            place.setPlacesToVisit(
                    "1. Manikarnika Ghat\n"
                    + "2. Kashi Vishwanath Temple\n"
                    + "3. Dashashwamedh Ghat\n"
                    + "4. Assi Ghat\n"
                    + "5. Ramnagar Fort"
            );
            place.setSeason("October to March (Winter and early Spring)");
        }

        return place;
    }

    @Override
    public String aboutPlace() {
        return getHarishchandra().getDescription();
    }

    @Override
    public String aboutRelgion() {
        return "Harishchandra Ghat holds deep significance in Hinduism. "
                + "It is associated with the concept of truth (Satya) and liberation (Moksha). "
                + "According to Hindu beliefs, those cremated here are believed to attain salvation.";
    }

    @Override
    public String getNearByAirport() {
        return "Nearest Airport: " + getHarishchandra().getNearestAirport();
    }

    @Override
    public String getNearByRailwayStation() {
        return "Nearest Railway Station: " + getHarishchandra().getNearestRailwayStation();
    }

    @Override
    public String getNearByCity() {
        return "Nearby City: Varanasi (~0 km, within city limits)";
    }

    @Override
    public String getNdearByTown() {
        return "Nearby Town: Ramnagar (~15 km)";
    }

    @Override
    public String getPlacestovisit() {
        return "Places to Visit: \n" + getHarishchandra().getPlacesToVisit();
    }

    @Override
    public String getSeason() {
        return "Best Season to Visit: " + getHarishchandra().getSeason();
    }
}
