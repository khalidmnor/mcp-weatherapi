package com.mcp.weather.config.props;

import com.mcp.weather.dto.props.WeatherApiProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
public class WeatherApiPropertiesConfig {
    @Bean
    @Validated
    @ConfigurationProperties(prefix = "weather-api")
    public WeatherApiProperties weatherApiProperties() {
        return new WeatherApiProperties();
    }
}
