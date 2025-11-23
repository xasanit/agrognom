package com.example.agrognom.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class RegionResponse (
    val id: Long,
    val name: String,
    val coordinates: String,
)