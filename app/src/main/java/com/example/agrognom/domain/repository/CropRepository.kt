package com.example.agrognom.domain.repository

import com.example.agrognom.data.dto.response.CropResponse

interface CropRepository {

    suspend fun getCrops(): List<CropResponse>

    suspend fun getCrop(id: Long): CropResponse

}