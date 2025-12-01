package com.example.agrognom.domain.usecase.soil

import com.example.agrognom.domain.model.Soil
import com.example.agrognom.domain.repository.SoilRepository

class GetSoilByIdUseCase(
    private val repository: SoilRepository
) {
    suspend operator fun invoke(id: Long): Soil {
        return repository.getSoil(id)
    }
}