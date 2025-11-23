package com.example.agrognom.data.api

import com.example.agrognom.data.dto.response.RegionResponse

interface Region {

    fun getRegions(): List<RegionResponse>

    fun getRegion(id: Long): RegionResponse

}