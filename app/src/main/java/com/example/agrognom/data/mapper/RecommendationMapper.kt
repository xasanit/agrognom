package com.example.agrognom.data.mapper

import com.example.agrognom.data.remote.dto.response.RecommendationResponse
import com.example.agrognom.domain.model.Recommendation

fun RecommendationResponse.toDomain(): Recommendation {
    return Recommendation(
        recommendation = recommendation
    )
}