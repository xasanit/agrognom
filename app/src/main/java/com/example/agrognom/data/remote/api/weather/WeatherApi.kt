package com.example.agrognom.data.remote.api.weather

import com.example.agrognom.data.remote.dto.response.WeatherResponse

interface WeatherApi {

    suspend fun getWeather(regionId: Long): WeatherResponse

}