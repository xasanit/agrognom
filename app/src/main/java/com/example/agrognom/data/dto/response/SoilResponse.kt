package com.example.agrognom.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class SoilResponse(
    val id: Long,
    val name: String,
)