package com.example.agrognom.domain.repository

import com.example.agrognom.data.dto.response.RecommendationResponse

interface RecommendationRepository {

    suspend fun getRecommendation(regionId: Long): RecommendationResponse

}