package com.example.agrognom.data.api.weather

import com.example.agrognom.data.dto.response.WeatherResponse
import com.example.agrognom.data.tokenStorage.authRequest
import com.example.agrognom.domain.repository.AuthRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class WeatherApiImpl(
    val client: HttpClient,
    val baseUrl: String,
    val authRepository: AuthRepository
): WeatherApi {
    override suspend fun getWeather(regionId: Long): WeatherResponse {
        return authRequest(authRepository) {
            client.get("${baseUrl}/weather/${regionId}").body()
        }
    }
}