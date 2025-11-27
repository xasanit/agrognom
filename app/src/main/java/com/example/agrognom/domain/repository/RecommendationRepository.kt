package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Recommendation

interface RecommendationRepository {

    suspend fun getRecommendation(regionId: Long): Recommendation

}