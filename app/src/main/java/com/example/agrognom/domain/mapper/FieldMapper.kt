package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.FieldResponse
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