-- =====================================================
-- Maharashtra Tourism Database Setup
-- Tour WebService Project - JDCollege Trainees
-- 23 Tourist Places in Maharashtra
-- =====================================================

-- Create database
CREATE DATABASE IF NOT EXISTS tour_webservice;
USE tour_webservice;

-- Drop tables if exist (for clean setup)
DROP TABLE IF EXISTS places_details;
DROP TABLE IF EXISTS placetype;

-- =====================================================
-- Create placetype table
-- =====================================================
CREATE TABLE placetype (
    refid INT PRIMARY KEY,
    place_type VARCHAR(100) NOT NULL
);

INSERT INTO placetype (refid, place_type) VALUES
(1, 'City'),
(2, 'Hill Station'),
(3, 'Beach'),
(4, 'Waterfall'),
(5, 'Historical'),
(6, 'Geography'),
(7, 'Zoo / Wildlife'),
(8, 'Religious - Temples, Churches, Mosques'),
(9, 'Seasonal Festivals');

-- =====================================================
-- Create places_details table
-- =====================================================
CREATE TABLE places_details (
    place_id INT PRIMARY KEY AUTO_INCREMENT,
    place_name VARCHAR(150) NOT NULL,
    description TEXT,
    location VARCHAR(150),
    google_location VARCHAR(250),
    places_to_visit TEXT,
    season VARCHAR(50),
    crime_against_tourists VARCHAR(50),
    nearest_airport VARCHAR(100),
    nearest_railway_station VARCHAR(100),
    placetype INT,
    FOREIGN KEY (placetype) REFERENCES placetype(refid)
);

-- =====================================================
-- Insert all 23 places in Maharashtra
-- =====================================================

-- CITIES (placetype = 1)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Mumbai', 'Financial capital with beaches, landmarks, and markets', 'Mumbai, Maharashtra', 'https://goo.gl/maps/4yX6Y5kL6o2J7xD16', 'Gateway of India, Marine Drive, Juhu Beach, Siddhivinayak Mandir', 'All Seasons', 'Medium', 'Chhatrapati Shivaji Maharaj International Airport', 'Mumbai CST', 1),
('Pune', 'Cultural hub with forts, gardens, heritage sites', 'Pune, Maharashtra', 'https://goo.gl/maps/dXU2GLRMLbL2', 'Shaniwar Wada, Aga Khan Palace, Sinhagad Fort', 'Winter', 'Low', 'Pune Airport', 'Pune Railway Station', 1),
('Nagpur', 'Orange city, Zero Mile Marker, Futala Lake', 'Nagpur, Maharashtra', 'https://goo.gl/maps/nAZRq4g7c3o', 'Diksha Bhoomi, Futala Lake, Dragon Palace Temple', 'Winter', 'Low', 'Dr. Babasaheb Ambedkar International Airport', 'Nagpur Railway Station', 1),
('Sambhaji Nagar', 'Historical city near Ajanta & Ellora caves', 'Aurangabad, Maharashtra', 'https://goo.gl/maps/ETb1n1Z8chF2', 'Bibi Ka Maqbara, Daulatabad Fort, Panchakki', 'Winter', 'Low', 'Aurangabad Airport', 'Aurangabad Railway Station', 1),
('Kolhapur', 'Known for Mahalaxmi Temple, Panhala Fort', 'Kolhapur, Maharashtra', 'https://goo.gl/maps/Lj3vSx1M2Qp', 'Mahalaxmi Temple, Rankala Lake, Panhala Fort', 'All Seasons', 'Low', 'Kolhapur Airport', 'Kolhapur Railway Station', 1);

-- HILL STATIONS (placetype = 2)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Mahabaleshwar', 'Strawberry capital and scenic hill station', 'Satara, Maharashtra', 'https://goo.gl/maps/N3n2V9D9BxP2', 'Venna Lake, Mapro Garden, Arthur''s Seat', 'Summer/Winter', 'Very Low', 'Pune Airport', 'Wathar Railway Station', 2),
('Lonavala', 'Popular weekend getaway with caves and greenery', 'Pune District, Maharashtra', 'https://goo.gl/maps/RyxAGvB9iTt', 'Bhushi Dam, Karla Caves, Rajmachi Fort', 'Monsoon/Winter', 'Low', 'Pune Airport', 'Lonavala Railway Station', 2),
('Harishchandra Ghat', 'Hill pass with trekking trails and viewpoints', 'Satara, Maharashtra', 'https://goo.gl/maps/XYZ123', 'Trekking, Viewpoints', 'Monsoon/Winter', 'Low', 'Pune Airport', 'Satara Railway Station', 2),
('Igatpuri', 'Hill station with Vipassana centre and waterfalls', 'Nashik District, Maharashtra', 'https://goo.gl/maps/4U7kM8VG9Q42', 'Bhatsa Dam, Tringalwadi Fort', 'Monsoon/Winter', 'Low', 'Nashik Airport', 'Igatpuri Railway Station', 2),
('Pach Madi', 'Hill station in Melghat region with forests', 'Amravati District, Maharashtra', 'https://goo.gl/maps/ABC789', 'Forest Trails, Temples', 'Monsoon/Winter', 'Low', 'Nagpur Airport', 'Badnera Railway Station', 2),
('Chikandara', 'Hill station near Melghat Tiger Reserve', 'Amravati District, Maharashtra', 'https://goo.gl/maps/DEF123', 'Melghat Wildlife, Gavilgad Fort', 'Monsoon/Winter', 'Low', 'Nagpur Airport', 'Badnera Railway Station', 2),
('Seven Sisters Hills', 'Scenic hills with trekking points', 'Satpura Range, Maharashtra', 'https://goo.gl/maps/8jDSe7vjAHJ2', 'Trekking Trails, Viewpoints', 'Monsoon/Winter', 'Low', 'Nagpur Airport', 'Betul Railway Station', 2);

-- BEACHES (placetype = 3)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Ratnagiri', 'Coastal city with beaches and forts', 'Ratnagiri, Maharashtra', 'https://goo.gl/maps/Jj8P8xkds8C2', 'Ratnadurg Fort, Beaches', 'Winter', 'Low', 'Ratnagiri Airport', 'Ratnagiri Railway Station', 3),
('Ganpatipule', 'Beach and pilgrimage site with Ganesh temple', 'Ratnagiri, Maharashtra', 'https://goo.gl/maps/17UtDZJHwL42', 'Ganpatipule Beach, Ganesh Temple', 'Winter', 'Low', 'Ratnagiri Airport', 'Ratnagiri Railway Station', 3),
('Aare Ware', 'Twin beaches near Ratnagiri with scenic views', 'Ratnagiri, Maharashtra', 'https://goo.gl/maps/3QnBHLzkWxu', 'Aare Beach, Ware Beach', 'Winter', 'Low', 'Ratnagiri Airport', 'Ratnagiri Railway Station', 3);

-- WATERFALLS (placetype = 4)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Thoseghar Falls', 'Scenic waterfall surrounded by hills', 'Satara, Maharashtra', 'https://goo.gl/maps/2dW9o7QZuQq', 'Thoseghar Falls, Sajjangad Fort', 'Monsoon', 'Low', 'Pune Airport', 'Satara Railway Station', 4);

-- HISTORICAL PLACES (placetype = 5)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Ajanta', 'UNESCO Buddhist rock-cut caves', 'Aurangabad, Maharashtra', 'https://goo.gl/maps/ETb1n1Z8chF2', 'Ajanta Caves, Ellora Caves', 'Winter', 'Low', 'Aurangabad Airport', 'Aurangabad Railway Station', 5),
('Ellora', 'UNESCO caves of Hindu, Jain, and Buddhist monuments', 'Aurangabad, Maharashtra', 'https://goo.gl/maps/fDFkG7xkzwP2', 'Kailasa Temple, Buddhist Caves, Jain Caves', 'Winter', 'Low', 'Aurangabad Airport', 'Aurangabad Railway Station', 5),
('Raighad', 'Historical fort near Mahad, Chhatrapati Shivaji''s capital', 'Raigad, Maharashtra', 'https://goo.gl/maps/Efx8u43EhHL2', 'Raighad Fort, Jagdishwar Temple', 'Winter', 'Low', 'Mumbai Airport', 'Veer Railway Station', 5);

-- GEOGRAPHY (placetype = 6)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Kaas Pathar', 'Plateau famous for seasonal wildflowers', 'Satara, Maharashtra', 'https://goo.gl/maps/67wF7mS42p92', 'Flower Valley, Vajrai Waterfall', 'Monsoon (Sep-Oct)', 'Low', 'Pune Airport', 'Satara Railway Station', 6),
('Lonar Salt Lake', 'Meteorite crater lake with unique ecology', 'Buldhana, Maharashtra', 'https://goo.gl/maps/q9P4R5F9kY82', 'Lonar Lake, Daitya Sudan Temple', 'Winter', 'Low', 'Aurangabad Airport', 'Jalna Railway Station', 6);

-- RELIGIOUS PLACES (placetype = 8)
INSERT INTO places_details 
(place_name, description, location, google_location, places_to_visit, season, crime_against_tourists, nearest_airport, nearest_railway_station, placetype)
VALUES
('Pandharpur Vitthal Mandir', 'Major pilgrimage of Lord Vitthal devotees', 'Solapur District, Maharashtra', 'https://goo.gl/maps/8jsrRaW33G92', 'Vitthal Temple, Chandrabhaga River', 'All Seasons', 'Low', 'Pune Airport', 'Kurduwadi Railway Station', 8),
('Kolhapur Lakshmi Temple', 'Famous temple dedicated to Goddess Lakshmi', 'Kolhapur, Maharashtra', 'https://goo.gl/maps/Lj3vSx1M2Qp', 'Mahalaxmi Temple, Jyotiba Temple nearby', 'All Seasons', 'Low', 'Kolhapur Airport', 'Kolhapur Railway Station', 8);

-- =====================================================
-- Verification Queries
-- =====================================================

-- Check all place types
SELECT * FROM placetype ORDER BY refid;

-- Check all places with their types
SELECT 
    pd.place_id,
    pd.place_name,
    pt.place_type,
    pd.location,
    pd.season
FROM places_details pd
JOIN placetype pt ON pd.placetype = pt.refid
ORDER BY pt.place_type, pd.place_name;

-- Count places by type
SELECT 
    pt.place_type,
    COUNT(pd.place_id) as place_count
FROM placetype pt
LEFT JOIN places_details pd ON pt.refid = pd.placetype
GROUP BY pt.refid, pt.place_type
ORDER BY pt.refid;

-- Get all places with full details
SELECT 
    pd.place_id,
    pd.place_name,
    pt.place_type,
    pd.description,
    pd.location,
    pd.places_to_visit,
    pd.season,
    pd.crime_against_tourists,
    pd.nearest_airport,
    pd.nearest_railway_station
FROM places_details pd
JOIN placetype pt ON pd.placetype = pt.refid
ORDER BY pt.refid, pd.place_name;

-- =====================================================
-- Total: 23 Tourist Places in Maharashtra
-- Breakdown:
-- Cities: 5 places
-- Hill Stations: 7 places  
-- Beaches: 3 places
-- Waterfalls: 1 place
-- Historical: 3 places
-- Geography: 2 places
-- Religious: 2 places
-- =====================================================