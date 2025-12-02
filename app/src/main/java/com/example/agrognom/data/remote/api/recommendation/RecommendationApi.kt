package com.example.agrognom.data.remote.api.recommendation

import com.example.agrognom.data.remote.dto.response.RecommendationResponse

interface RecommendationApi {

    suspend fun getRecommendation(fieldId: Long): RecommendationResponse

}