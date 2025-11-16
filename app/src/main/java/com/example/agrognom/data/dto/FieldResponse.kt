package com.example.agrognom.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class FieldResponse (
    val id: Long,
    val userId: Long,
    val name: String,
    val area: String,
    val cropId: Long,
    val soilId: Long,
    val regionId: Long,
)