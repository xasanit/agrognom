package com.example.agrognom.data.dto.request

import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class FieldCreateRequest(
    val name: String,
    val area: BigDecimal,
    val cropId: Long?,
    val soilId: Long?,
    val regionId: Long?
)