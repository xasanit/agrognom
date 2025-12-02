package com.example.agrognom.data.remote.api.crop

import com.example.agrognom.data.remote.dto.response.CropResponse

interface CropApi {

    suspend fun getCrops(): List<CropResponse>

    suspend fun getCrop(id: Long): CropResponse

}