package com.example.agrognom.domain.usecase.crop

import com.example.agrognom.domain.model.Crop
import com.example.agrognom.domain.repository.CropRepository

class GetCropByIdUseCase(
    private val repository: CropRepository
) {
    suspend operator fun invoke(id: Long): Crop {
        return repository.getCrop(id)
    }
}