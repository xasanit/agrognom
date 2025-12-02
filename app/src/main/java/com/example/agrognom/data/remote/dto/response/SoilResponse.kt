package com.example.agrognom.data.remote.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class SoilResponse(
    val id: Long,
    val name: String,
)