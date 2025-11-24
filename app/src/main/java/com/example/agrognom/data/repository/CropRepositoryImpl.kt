package com.example.agrognom.data.repository

import com.example.agrognom.data.api.crop.CropApi
import com.example.agrognom.data.dto.response.CropResponse
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.CropRepository

class CropRepositoryImpl(
    private val api: CropApi,
    private val authRepository: AuthRepository
) : CropRepository {

    override suspend fun getCrops(): List<CropResponse> {
        return api.getCrops()
    }

    override suspend fun getCrop(id: Long): CropResponse {
        return api.getCrop(id)
    }
}