package com.example.agrognom.data.remote.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val location: String,
    val temp_c: Double,
    val humidity: Int,
    val condition: String,
    val last_updated: String,
)