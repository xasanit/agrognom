package com.example.agrognom.domain.usecase.weather

import com.example.agrognom.domain.model.Weather
import com.example.agrognom.domain.repository.WeatherRepository

class GetCurrentWeatherUseCase(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(regionId: Long): Weather {
        return repository.getWeather(regionId)
    }
}