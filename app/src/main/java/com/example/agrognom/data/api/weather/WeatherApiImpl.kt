package com.example.agrognom.data.api.weather

import com.example.agrognom.data.dto.response.WeatherResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class WeatherApiImpl(
    val client: HttpClient,
    val baseUrl: String
): WeatherApi {
    override suspend fun getWeather(regionId: Long): WeatherResponse {
        return client.get("${baseUrl}/weather/${regionId}").body()
    }
}