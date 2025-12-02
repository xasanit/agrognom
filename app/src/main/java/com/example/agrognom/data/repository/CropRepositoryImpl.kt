package com.example.agrognom.data.repository

import com.example.agrognom.data.local.authRequest
import com.example.agrognom.data.mapper.toDomain
import com.example.agrognom.data.remote.api.crop.CropApi
import com.example.agrognom.domain.model.Crop
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.CropRepository

class CropRepositoryImpl(
    private val api: CropApi,
    private val authRepository: AuthRepository
) : CropRepository {

    override suspend fun getCrops(): List<Crop> {
        return authRequest(authRepository) {
            api.getCrops()
        }.map { it.toDomain() }
    }

    override suspend fun getCrop(id: Long): Crop {
        return authRequest(authRepository) {
            api.getCrop(id)
        }.toDomain()
    }
}