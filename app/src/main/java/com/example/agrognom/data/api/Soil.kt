package com.example.agrognom.data.api

import com.example.agrognom.data.dto.response.SoilResponse

interface Soil {

    fun getSoils(): List<SoilResponse>

    fun getSoil(id: Long): SoilResponse

}