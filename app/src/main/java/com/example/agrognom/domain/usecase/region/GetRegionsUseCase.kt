package com.example.agrognom.domain.usecase.region

import com.example.agrognom.domain.model.Region
import com.example.agrognom.domain.repository.RegionRepository

class GetRegionsUseCase(
    private val repository: RegionRepository
) {
    suspend operator fun invoke(): List<Region> {
        return repository.getRegions()
    }
}