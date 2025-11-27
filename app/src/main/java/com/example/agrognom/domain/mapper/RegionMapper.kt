package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.RegionResponse
import com.example.agrognom.domain.model.Region

fun RegionResponse.toDomain(): Region {
    return Region(
        id = id,
        name = name,
        coordinates = coordinates
    )
}