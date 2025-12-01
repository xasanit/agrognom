package com.example.agrognom.domain.usecase.soil

import com.example.agrognom.domain.model.Soil
import com.example.agrognom.domain.repository.SoilRepository

class GetSoilsUseCase(
    private val repository: SoilRepository
) {
    suspend operator fun invoke(): List<Soil> {
        return repository.getSoils()
    }
}