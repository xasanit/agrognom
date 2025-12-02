package com.example.agrognom.data.remote.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class RegionResponse (
    val id: Long,
    val name: String,
    val coordinates: String,
)