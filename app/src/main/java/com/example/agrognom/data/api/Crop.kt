package com.example.agrognom.data.api

import com.example.agrognom.data.dto.response.CropResponse

interface Crop {

    suspend fun getCrops(): List<CropResponse>

    suspend fun getCrop(id: Long): CropResponse

}