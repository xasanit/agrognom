package com.example.agrognom.data.mapper

import com.example.agrognom.data.remote.dto.response.RegionResponse
import com.example.agrognom.domain.model.Region

fun RegionResponse.toDomain(): Region {
    return Region(
        id = id,
        name = name,
        coordinates = coordinates
    )
}