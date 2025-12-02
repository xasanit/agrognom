package com.example.agrognom.data.mapper

import com.example.agrognom.data.remote.dto.response.CropResponse
import com.example.agrognom.domain.model.Crop

fun CropResponse.toDomain(): Crop {
    return Crop(
        id = id,
        name = name
    )
}