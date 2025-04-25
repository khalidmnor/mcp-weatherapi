package com.mcp.weather.dto.props;

import lombok.Data;

@Data
public class WeatherApiProperties {
    private String baseUrl;
    private String endpoint;
    private String apiKey;
}
