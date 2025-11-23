package com.example.agrognom.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val location: Location,
    val current: Current,
)

@Serializable
data class Location(
    val name: String,
)

@Serializable
data class Current(
    val temp_c: Double,
    val humidity: Int,
    val condition: Condition,
    val last_updated: String,
)

@Serializable
data class Condition(
    val text: String,
)