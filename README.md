# Tour WebService - Maharashtra Tourism REST API

Java FS Trainees from JDCollege Batch 1 and Batch 2 are involved in creating a tour website for Maharashtra tourism.
Each trainee will develop one REST Controller for displaying the details of a specific place in Maharashtra.
The website will be hosted at **goroamindia.com**.

## Project Overview

This is a Spring Boot REST API project that provides comprehensive information about tourist places in Maharashtra, India.

## Database Schema

### PlaceType Table

| refid | place_type                             |
| ----- | -------------------------------------- |
| 1     | City                                   |
| 2     | Hill Station                           |
| 3     | Beach                                  |
| 4     | Waterfall                              |
| 5     | Historical                             |
| 6     | Geography                              |
| 7     | Zoo / Wildlife                         |
| 8     | Religious - Temples, Churches, Mosques |
| 9     | Seasonal Festivals                     |

### Places_Details Table

| Column                  | Description                    |
| ----------------------- | ------------------------------ |
| place_id                | Primary Key (Auto Increment)   |
| place_name              | Name of the place              |
| description             | Detailed description           |
| location                | Location details               |
| google_location         | Google Maps URL                |
| places_to_visit         | Tourist attractions            |
| season                  | Best season to visit           |
| crime_against_tourists  | Safety level                   |
| nearest_airport         | Closest airport                |
| nearest_railway_station | Closest railway station        |
| placetype               | Foreign Key to placetype table |

## Trainee Place Assignment Table

**Instructions for Trainees:**

1. Pick ONE place from the list below
2. Add your name in the "Trainee" column next to your chosen place
3. Create a REST Controller for that specific place
4. Each place should be assigned to only ONE trainee

| Trainee          | Choice | Place Name                | Place Type   | Description / Notes                                       |
| ---------------- | ------ | ------------------------- | ------------ | --------------------------------------------------------- |
| Fulanshu Kuthe   | ✓      | Mumbai                    | City         | Financial capital with beaches, landmarks, and markets    |
| Pranay           | ✓      | Pune                      | City         | Cultural hub with forts, gardens, heritage sites          |
| Utkarsha I       | ✓      | Nagpur                    | City         | Orange city, Zero Mile Marker, Futala Lake                |
| Gargie Purwar    | ✓      | Sambhaji Nagar            | City         | Historical city near Ajanta & Ellora caves                |
| Vaibhavi G       | ✓      | Kolhapur                  | City         | Known for Mahalaxmi Temple, Panhala Fort                  |
| Prashika T       | ✓      | Ajanta                    | Historical   | UNESCO Buddhist rock-cut caves                            |
|PAWAN DIGHORE       |        | Ellora                    | Historical   | UNESCO caves of Hindu, Jain, and Buddhist monuments       |
|Minal D            |        | Kaas Pathar               | Geography    | Plateau famous for seasonal wildflowers                   |
| Gaytari J        | ✓      | Lonar Salt Lake           | Geography    | Meteorite crater lake with unique ecology                 |
| Mansi N          | ✓      | Mahabaleshwar             | Hill Station | Strawberry capital and scenic hill station                |
| Shantanu Dorle   | ✓      | Lonavala                  | Hill Station | Popular weekend getaway with caves and greenery           |
| Neha Thakre      | ✓      | Harishchandra Ghat        | Hill Station | Hill pass with trekking trails and viewpoints             |
| Om ingle         | ✓      | Igatpuri                  | Hill Station | Hill station with Vipassana centre and waterfalls         |
| Sudhanshu S      | ✓      | Pach Madi                 | Hill Station | Hill station in Melghat region with forests               |
| Pratiksha R      | ✓      | Chikandara                | Hill Station | Hill station near Melghat Tiger Reserve                   |
| Rupali Korkanti  | ✓      | Seven Sisters Hills       | Hill Station | Scenic hills with trekking points                         |
| Vaidehi Warambhe | ✓      | Ratnagiri                 | Beach        | Coastal city with beaches and forts                       |
| Sarika Khorgade  | ✓      | Ganpatipule               | Beach        | Beach and pilgrimage site with Ganesh temple              |
| Harshal Nakade   | ✓      | Aare Ware                 | Beach        | Twin beaches near Ratnagiri with scenic views             |
| Sarang Marotkar  | ✓      | Raighad                   | Historical   | Historical fort near Mahad, Chhatrapati Shivaji's capital |
| Sandesh Mate     | ✓      | Thoseghar Falls           | Waterfall    | Scenic waterfall surrounded by hills                      |
| Chetan Rathod    | ✓      | Thoseghar Falls           | Waterfall    | Scenic waterfall surrounded by hills                      |
| Purva Ughade     | ✓      | Pandharpur Vitthal Mandir | Religious    | Major pilgrimage of Lord Vitthal devotees                 |
| Jayant Meshram   | ✓      | Kolhapur Lakshmi Temple   | Religious    | Famous temple dedicated to Goddess Lakshmi                |
| Ganesh D         | ✓      | Shegaon                   | Religious    | famous for its shani mandir                               |

## How to Claim Your Place

1. **Edit this README.md file**
2. **Add your name** in the "Trainee" column next to your chosen place
3. **Mark "✓"** in the "Choice" column to confirm your selection
4. **Commit your changes** with message: "Claimed [Place Name] - [Your Name]"
5. **Create your REST Controller** for the assigned place

## Project Structure (To be implemented)

```
src/main/java/com/goroamindia/tour/
├── controller/          # REST Controllers (one per trainee/place)
├── model/              # Entity classes
├── repository/         # JPA Repositories
├── service/            # Business logic
├── config/             # Configuration classes
└── TourWebserviceApplication.java
```

## REST API Endpoints (To be implemented)

- `GET /api/places` - Get all places
- `GET /api/places/{id}` - Get place by ID
- `GET /api/places/type/{typeId}` - Get places by type
- `GET /api/places/search?name={placeName}` - Search places by name

## Technology Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL Database**
- **Maven**
- **REST API**

## Database Setup

See `SqlQuerry.txt` for the complete SQL script to create and populate the database with all 23 places in Maharashtra.
