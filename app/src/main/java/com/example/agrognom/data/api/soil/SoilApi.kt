package com.example.agrognom.data.api.soil

import com.example.agrognom.data.dto.response.SoilResponse

interface SoilApi {

    suspend fun getSoils(): List<SoilResponse>

    suspend fun getSoil(id: Long): SoilResponse

}