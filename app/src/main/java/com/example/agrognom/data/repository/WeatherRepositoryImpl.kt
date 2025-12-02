package com.example.agrognom.data.repository

import com.example.agrognom.data.local.authRequest
import com.example.agrognom.data.mapper.toDomain
import com.example.agrognom.data.remote.api.weather.WeatherApi
import com.example.agrognom.domain.model.Weather
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.WeatherRepository

class WeatherRepositoryImpl(
    private val api: WeatherApi,
    private val authRepository: AuthRepository
): WeatherRepository {

    override suspend fun getWeather(regionId: Long): Weather {
        return authRequest(authRepository) {
            api.getWeather(regionId)
        }.toDomain()
    }
}