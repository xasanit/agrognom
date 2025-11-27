package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.RecommendationResponse
import com.example.agrognom.domain.model.Recommendation

fun RecommendationResponse.toDomain(): Recommendation {
    return Recommendation(
        recommendation = recommendation
    )
}