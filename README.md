# Weather Service Application

This project is a Spring Boot application that provides weather information by city name using a REST API.

## Features

- Fetch current weather details for a given city.
- Built with Java and Kotlin.
- Uses Spring Boot for application development.
- Reactive WebClient for API calls.
- Configurable API properties.
- Logs weather information for debugging purposes.
- Supports JSON responses for easy integration.
- Modular design with DTOs for clean data handling.

## Technologies Used

- **Java 21**
- **Kotlin**
- **Spring Boot 3.4.5**
- **Maven**
- **Lombok**
- **WebClient**

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.8 or higher

### Configuration
  The application requires API properties to be configured in application.yml 
  or application.properties. 
  Below is an example configuration:
  ```bash
  weather-api:
  base-url: https://api.weatherapi.com/v1
  endpoint: /current.json
  api-key: YOUR_API_KEY
  ```
  Replace YOUR_API_KEY with your actual API key.


### API Endpoints
 - GET /weather?city={cityName}: Fetches the current weather for the specified city.