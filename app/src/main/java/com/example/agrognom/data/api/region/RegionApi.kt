package com.example.agrognom.data.api.region

import com.example.agrognom.data.dto.response.RegionResponse

interface RegionApi {

    suspend fun getRegions(): List<RegionResponse>

    suspend fun getRegion(id: Long): RegionResponse

}