package com.example.agrognom.data.mapper

import com.example.agrognom.data.remote.dto.response.SoilResponse
import com.example.agrognom.domain.model.Soil

fun SoilResponse.toDomain(): Soil{
    return Soil(
        id = id,
        name = name
    )
}