package com.example.agrognom.data.repository

import com.example.agrognom.data.api.soil.SoilApi
import com.example.agrognom.data.tokenStorage.authRequest
import com.example.agrognom.domain.mapper.toDomain
import com.example.agrognom.domain.model.Soil
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.SoilRepository

class SoilRepositoryImpl(
    private val api: SoilApi,
    private val authRepository: AuthRepository,
): SoilRepository {

    override suspend fun getSoils(): List<Soil> {
        return authRequest(authRepository) {
            api.getSoils()
        }.map { it.toDomain() }
    }

    override suspend fun getSoil(id: Long): Soil {
        return authRequest(authRepository) {
            api.getSoil(id)
        }.toDomain()
    }

}