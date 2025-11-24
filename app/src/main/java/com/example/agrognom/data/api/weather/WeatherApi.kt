package com.example.agrognom.data.api.weather

import com.example.agrognom.data.dto.response.WeatherResponse

interface WeatherApi {

    suspend fun getWeather(regionId: Long): WeatherResponse

}