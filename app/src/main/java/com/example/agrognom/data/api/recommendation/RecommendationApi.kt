package com.example.agrognom.data.api.recommendation

import com.example.agrognom.data.dto.response.RecommendationResponse

interface RecommendationApi {

    suspend fun getRecommendation(fieldId: Long): RecommendationResponse

}