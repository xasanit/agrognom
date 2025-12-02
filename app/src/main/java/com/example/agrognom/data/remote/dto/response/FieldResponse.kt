package com.example.agrognom.data.remote.dto.response

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