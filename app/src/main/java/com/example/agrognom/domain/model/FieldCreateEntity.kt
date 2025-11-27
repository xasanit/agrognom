package com.example.agrognom.domain.model

import java.math.BigDecimal

data class FieldCreateEntity(
    val name: String,
    val area: BigDecimal,
    val cropId: Long,
    val soilId: Long,
    val regionId: Long
)