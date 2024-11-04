# Digital Hospital Management System

A Spring Boot application for managing hospital operations digitally.

## Project Structure

```
digital-hospital/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── hospital/
│   │   │           ├── config/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── security/
│   │   │           └── service/
│   │   └── resources/
│   │       ├── templates/
│   │       ├── application.properties
│   │       └── data.sql
└── pom.xml
```

## Features

- User authentication with Aadhar number
- Appointment booking system
- Digital medical records management
- Doctor management
- H2 database with automatic schema creation

## Setup Instructions

1. Ensure you have Java 17 installed
2. Clone this repository
3. Run `mvn spring-boot:run` to start the application
4. Access the application at `http://localhost:8080`

## Default Credentials

- H2 Database Console: `http://localhost:8080/h2-console`
  - JDBC URL: `jdbc:h2:file:./hospitaldb`
  - Username: sa
  - Password: password

## Database

The application uses H2 database with:
- Automatic schema creation
- Sample data initialization
- File-based storage for data persistence