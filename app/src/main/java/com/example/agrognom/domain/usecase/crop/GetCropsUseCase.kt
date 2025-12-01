package com.example.agrognom.domain.usecase.crop

import com.example.agrognom.domain.model.Crop
import com.example.agrognom.domain.repository.CropRepository

class GetCropsUseCase(
    private val repository: CropRepository
) {
    suspend operator fun invoke(): List<Crop> {
        return repository.getCrops()
    }
}