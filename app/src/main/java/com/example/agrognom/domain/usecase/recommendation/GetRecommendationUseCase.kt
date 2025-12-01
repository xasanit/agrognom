package com.example.agrognom.domain.usecase.recommendation

import com.example.agrognom.domain.model.Recommendation
import com.example.agrognom.domain.repository.RecommendationRepository

class GetRecommendationUseCase(
    private val repository: RecommendationRepository
) {
    suspend operator fun invoke(regionId: Long): Recommendation {
        return repository.getRecommendation(regionId)
    }
}