package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.request.FieldCreateRequest
import com.example.agrognom.domain.model.FieldCreateEntity

fun FieldCreateEntity.toDto(): FieldCreateRequest{
    return FieldCreateRequest(
        name = name,
        area = area,
        cropId = cropId,
        soilId = soilId,
        regionId = regionId
    )
}