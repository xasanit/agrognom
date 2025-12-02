package com.example.agrognom.data.repository

import com.example.agrognom.data.local.authRequest
import com.example.agrognom.data.mapper.toDomain
import com.example.agrognom.data.remote.api.region.RegionApi
import com.example.agrognom.domain.model.Region
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.RegionRepository

class RegionRepositoryImpl(
    private val api: RegionApi,
    private val authRepository: AuthRepository
): RegionRepository {
    override suspend fun getRegion(id: Long): Region {
        return authRequest(authRepository) {
            api.getRegion(id)
        }.toDomain()
    }

    override suspend fun getRegions(): List<Region> {
        return authRequest(authRepository) {
            api.getRegions()
        }.map { it.toDomain() }
    }
}