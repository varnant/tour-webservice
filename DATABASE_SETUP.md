 Database Setup Instructions for Pach Madi API

## Prerequisites

1. MySQL Server 8.0+ installed
2. MySQL Workbench (optional but recommended)

## Step-by-Step Database Setup

### 1. Start MySQL Server

```bash
# Windows - Start MySQL service
net start mysql80

# Or use MySQL Workbench to connect
```

### 2. Create Database and Tables

```sql
-- Run this in MySQL Workbench or command line
SOURCE c:/Users/SUDHANSHU/Desktop/git Mahha Our/tour-webservice/SqlQuery_Maharashtra_23_Places.sql
```

### 3. Verify Data

```sql
-- Check if Pach Madi data is inserted
SELECT * FROM places_details WHERE place_name = 'Pach Madi';

-- Check all hill stations
SELECT pd.place_name, pt.place_type
FROM places_details pd
JOIN placetype pt ON pd.placetype = pt.refid
WHERE pt.refid = 2;
```

### 4. Update application.properties

Make sure your database credentials match:

```properties
spring.datasource.username=root
spring.datasource.password=your_mysql_password
```

## Sample Pach Madi Data

The database should contain this data for Pach Madi:

- **Place Name**: Pach Madi
- **Type**: Hill Station (ID: 2)
- **Location**: Amravati District, Maharashtra
- **Description**: Hill station in Melghat region with forests
- **Attractions**: Forest Trails, Temples
- **Season**: Monsoon/Winter
- **Airport**: Nagpur Airport
- **Railway**: Badnera Railway Station
