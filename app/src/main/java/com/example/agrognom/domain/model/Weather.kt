package com.example.agrognom.domain.model

data class Weather(
    val location: String,
    val temp_c: Double,
    val humidity: Int,
    val condition: String,
    val last_updated: String,
)