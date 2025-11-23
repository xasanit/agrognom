package com.example.agrognom.data.api

import com.example.agrognom.data.dto.response.WeatherResponse

interface Weather {

    fun getWeather(regionId: Long): WeatherResponse

}