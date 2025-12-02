package com.example.agrognom.data.remote.api.soil

import com.example.agrognom.data.remote.dto.response.SoilResponse

interface SoilApi {

    suspend fun getSoils(): List<SoilResponse>

    suspend fun getSoil(id: Long): SoilResponse

}