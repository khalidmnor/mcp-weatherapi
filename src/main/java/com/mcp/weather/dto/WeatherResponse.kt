package com.mcp.weather.dto

import com.mcp.weather.dto.Current
import com.mcp.weather.dto.Location

data class WeatherResponse(
    val current: Current,
    val location: Location
)