# Testing Your Pach Madi API - Sudhanshu S

## Quick Test Guide

### 1. Start Your Application

1. Open Spring Tool Suite (STS)
2. Import the project as "Existing Maven Projects"
3. Right-click on `TourWebserviceApplication.java` → Run As → Java Application
4. Look for this message in console: "🏔️ Maharashtra Tourism API Started Successfully!"

### 2. Test Endpoints

#### Basic Test - Get Pach Madi Details

```bash
curl http://localhost:8080/api/places/pach-madi
```

#### Get Attractions

```bash
curl http://localhost:8080/api/places/pach-madi/attractions
```

#### Get Travel Information

```bash
curl http://localhost:8080/api/places/pach-madi/travel-info
```

#### Get Weather Information

```bash
curl http://localhost:8080/api/places/pach-madi/weather
```

#### Get Wildlife Information

```bash
curl http://localhost:8080/api/places/pach-madi/wildlife
```

#### Get General Information

```bash
curl http://localhost:8080/api/places/pach-madi/info
```

### 3. Browser Testing

Open these URLs in your browser:

- http://localhost:8080/api/places/pach-madi
- http://localhost:8080/api/places/pach-madi/attractions
- http://localhost:8080/api/places/pach-madi/travel-info
- http://localhost:8080/api/places/pach-madi/weather
- http://localhost:8080/api/places/pach-madi/wildlife
- http://localhost:8080/api/places/pach-madi/info

### 4. Expected JSON Response Example

```json
{
  "placeId": 13,
  "placeName": "Pach Madi",
  "description": "Hill station in Melghat region with forests",
  "location": "Amravati District, Maharashtra",
  "googleLocation": "https://goo.gl/maps/ABC789",
  "placesToVisit": "Forest Trails, Temples",
  "season": "Monsoon/Winter",
  "crimeAgainstTourists": "Low",
  "nearestAirport": "Nagpur Airport",
  "nearestRailwayStation": "Badnera Railway Station",
  "placeType": {
    "refid": 2,
    "placeType": "Hill Station"
  }
}
```

### 5. Troubleshooting

#### If you get 404 Not Found:

- Check if application started successfully
- Verify database connection
- Check if Pach Madi data exists in database

#### If you get 500 Internal Server Error:

- Check database connection in application.properties
- Verify MySQL is running
- Check console logs for detailed error

#### Database Connection Issues:

```sql
-- Run this to check if data exists
SELECT * FROM places_details WHERE place_name = 'Pach Madi';
```

### 6. Success Indicators

✅ Application starts without errors
✅ All 6 endpoints return JSON responses
✅ No 404 or 500 errors
✅ JSON contains Pach Madi specific information

### 7. Next Steps After Testing

1. Take screenshots of successful API responses
2. Update TRAINEE_ASSIGNMENTS.md status to "Complete"
3. Prepare for integration with main goroamindia.com website
4. Create pull request for code review

## Your API Endpoints Summary:

- `GET /api/places/pach-madi` - Complete place details
- `GET /api/places/pach-madi/attractions` - Tourist attractions
- `GET /api/places/pach-madi/travel-info` - Travel and transport info
- `GET /api/places/pach-madi/weather` - Weather and seasons
- `GET /api/places/pach-madi/wildlife` - Wildlife and eco-tourism
- `GET /api/places/pach-madi/info` - General information

**Great job creating your first REST API for Maharashtra Tourism! 🎉**
