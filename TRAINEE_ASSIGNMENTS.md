# Trainee Assignment Tracker

## How to Select Your Place

1. **Choose ONE place** from the list below
2. **Edit this file** and add your name in the "Trainee" column
3. **Mark "✓"** in the "Choice" column
4. **Commit your changes** with message: "Claimed [Place Name] - [Your Name]"
5. **Create your REST Controller** for the assigned place

## Assignment Status

| Trainee Name | Choice | Place Name                | Place Type   | Status    | Controller Class Name             |
| ------------ | ------ | ------------------------- | ------------ | --------- | --------------------------------- |
|              |        | Mumbai                    | City         | Available | MumbaiController                  |
|              |        | Pune                      | City         | Available | PuneController                    |
|              |        | Nagpur                    | City         | Available | NagpurController                  |
|              |        | Sambhaji Nagar            | City         | Available | SambhajiNagarController           |
|              |        | Kolhapur                  | City         | Available | KolhapurController                |
|              |        | Ajanta                    | Historical   | Available | AjantaController                  |
|              |        | Ellora                    | Historical   | Available | ElloraController                  |
|              |        | Kaas Pathar               | Geography    | Available | KaasPatharController              |
|              |        | Lonar Salt Lake           | Geography    | Available | LonarSaltLakeController           |
|              |        | Mahabaleshwar             | Hill Station | Available | MahabaleshwarController           |
|              |        | Lonavala                  | Hill Station | Available | LonavalaController                |
|              |        | Harishchandra Ghat        | Hill Station | Available | HarishchandraGhatController       |
|              |        | Igatpuri                  | Hill Station | Available | IgatpuriController                |
|              |        | Pach Madi                 | Hill Station | Available | PachMadiController                |
|              |        | Chikandara                | Hill Station | Available | ChikandaraController              |
|              |        | Seven Sisters Hills       | Hill Station | Available | SevenSistersHillsController       |
|              |        | Ratnagiri                 | Beach        | Available | RatnagiriController               |
|              |        | Ganpatipule               | Beach        | Available | GanpatipuleController             |
|              |        | Aare Ware                 | Beach        | Available | AareWareController                |
|              |        | Raighad                   | Historical   | Available | RaighadController                 |
|              |        | Thoseghar Falls           | Waterfall    | Available | ThosegharFallsController          |
|              |        | Pandharpur Vitthal Mandir | Religious    | Available | PandharpurVitthalMandirController |
|              |        | Kolhapur Lakshmi Temple   | Religious    | Available | KolhapurLakshmiTempleController   |

## Instructions for Trainees

### Step 1: Claim Your Place

- Add your name in the "Trainee Name" column
- Put "✓" in the "Choice" column
- Change "Available" to "In Progress" in the "Status" column

### Step 2: Create Your Controller

- Use the suggested controller class name
- Implement the following endpoints:
  - `GET /api/places/{yourplace}` - Get details of your place
  - `GET /api/places/{yourplace}/attractions` - Get tourist attractions
  - `GET /api/places/{yourplace}/travel-info` - Get travel information

### Step 3: Follow the Template

```java
@RestController
@RequestMapping("/api/places")
public class YourPlaceController {

    @GetMapping("/{yourplace}")
    public ResponseEntity<PlaceDetails> getPlaceDetails() {
        // Implementation
    }

    @GetMapping("/{yourplace}/attractions")
    public ResponseEntity<List<String>> getAttractions() {
        // Implementation
    }

    @GetMapping("/{yourplace}/travel-info")
    public ResponseEntity<TravelInfo> getTravelInfo() {
        // Implementation
    }
}
```

### Step 4: Test Your Endpoints

- Test with Postman or browser
- Ensure JSON responses are properly formatted
- Include error handling

### Step 5: Mark Complete

- Change status from "In Progress" to "Complete"
- Add link to your controller file

## Rules

1. **One place per trainee** - First come, first served
2. **No duplicate assignments** - Check before claiming
3. **Commit your claim immediately** - To avoid conflicts
4. **Use suggested controller names** - For consistency
5. **Follow REST conventions** - Standard HTTP methods and status codes

## Need Help?

- Check the README.md for project setup
- Refer to SqlQuery_Maharashtra_23_Places.sql for database schema
- Ask instructors for clarification
