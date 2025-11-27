package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.CropResponse
import com.example.agrognom.domain.model.Crop

fun CropResponse.toDomain(): Crop {
    return Crop(
        id = id,
        name = name
    )
}