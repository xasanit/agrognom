package com.example.agrognom.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class RecommendationResponse(
    val recommendation: String,
)