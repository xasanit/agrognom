package com.example.agrognom.domain.model

import java.math.BigDecimal

data class FieldCreate(
    val name: String,
    val area: BigDecimal,
    val cropId: Long,
    val soilId: Long,
    val regionId: Long
)