package com.example.agrognom.data.remote.api.region

import com.example.agrognom.data.remote.dto.response.RegionResponse

interface RegionApi {

    suspend fun getRegions(): List<RegionResponse>

    suspend fun getRegion(id: Long): RegionResponse

}