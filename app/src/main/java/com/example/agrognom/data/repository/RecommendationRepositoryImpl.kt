package com.example.agrognom.data.repository

import com.example.agrognom.data.local.authRequest
import com.example.agrognom.data.mapper.toDomain
import com.example.agrognom.data.remote.api.recommendation.RecommendationApi
import com.example.agrognom.domain.model.Recommendation
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.RecommendationRepository

class RecommendationRepositoryImpl(
    private val api: RecommendationApi,
    private val authRepository: AuthRepository
): RecommendationRepository {
    override suspend fun getRecommendation(regionId: Long): Recommendation {
        return authRequest(authRepository) {
            api.getRecommendation(regionId)
        }.toDomain()
    }
}