package com.example.agrognom.data.mapper

import com.example.agrognom.data.remote.dto.response.FieldResponse
import com.example.agrognom.domain.model.Field

fun FieldResponse.toDomain(): Field {
    return Field(
        id = id,
        userId = userId,
        name = name,
        area = area,
        cropId = cropId,
        soilId = soilId,
        regionId = regionId
    )
}