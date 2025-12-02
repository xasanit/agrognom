package com.example.agrognom.data.remote.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class RecommendationResponse(
    val recommendation: String,
)