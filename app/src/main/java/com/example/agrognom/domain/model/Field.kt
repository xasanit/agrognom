package com.example.agrognom.domain.model

data class Field(
    val id: Long,
    val userId: Long,
    val name: String,
    val area: String,
    val cropId: Long,
    val soilId: Long,
    val regionId: Long,
)