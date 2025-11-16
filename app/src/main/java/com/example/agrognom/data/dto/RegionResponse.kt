package com.example.agrognom.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class RegionResponse (
    val id: Long,
    val name: String,
    val coordinates: String,
)