package com.example.agrognom.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class CropResponse (
    val id: Long,
    val name: String,
)