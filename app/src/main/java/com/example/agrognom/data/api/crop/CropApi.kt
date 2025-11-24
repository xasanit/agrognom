package com.example.agrognom.data.api.crop

import com.example.agrognom.data.dto.response.CropResponse

interface CropApi {

    suspend fun getCrops(): List<CropResponse>

    suspend fun getCrop(id: Long): CropResponse

}