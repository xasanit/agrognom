package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Crop

interface CropRepository {

    suspend fun getCrops(): List<Crop>

    suspend fun getCrop(id: Long): Crop

}