package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.WeatherResponse
import com.example.agrognom.domain.model.Weather

fun WeatherResponse.toDomain(): Weather {
    return Weather(
        location = location,
        temp_c = temp_c,
        humidity = humidity,
        condition = condition,
        last_updated = last_updated
    )
}