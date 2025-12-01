package com.example.agrognom.domain.usecase.region

import com.example.agrognom.domain.model.Region
import com.example.agrognom.domain.repository.RegionRepository

class GetRegionByIdUseCase(
    private val repository: RegionRepository
) {
    suspend operator fun invoke(id: Long): Region {
        return repository.getRegion(id)
    }
}