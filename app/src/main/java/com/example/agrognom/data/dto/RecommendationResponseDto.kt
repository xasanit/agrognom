package com.example.agrognom.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class RecommendationResponseDto(
    val recommendation: String,
)