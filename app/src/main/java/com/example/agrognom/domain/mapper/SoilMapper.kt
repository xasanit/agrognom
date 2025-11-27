package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.SoilResponse
import com.example.agrognom.domain.model.Soil

fun SoilResponse.toDomain(): Soil{
    return Soil(
        id = id,
        name = name
    )
}