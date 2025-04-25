package com.mcp.weather.service;

import com.dnt.dntmcp.dto.WeatherResponse;
import com.mcp.weather.dto.props.WeatherApiProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherApiProperties properties;

    @Tool(description = "Get weather information by city name")
    public String getWeather(String cityName) {
        WebClient client = WebClient.create(properties.getBaseUrl());
        WeatherResponse response = client.get()
                .uri(uriBuilder -> uriBuilder.path(properties.getEndpoint())
                        .queryParam("key", properties.getApiKey())
                        .queryParam("q", cityName)
                        .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class)
                .block();
        log.info(response != null ? response.toString() : null);
        if (response != null) return Double.toString( response.getCurrent().getTemp_c() );
        return Strings.EMPTY;
    }
}
