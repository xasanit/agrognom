package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Weather

interface WeatherRepository {

    suspend fun getWeather(regionId: Long): Weather

}