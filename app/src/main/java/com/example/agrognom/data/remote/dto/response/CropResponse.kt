package com.example.agrognom.data.remote.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class CropResponse (
    val id: Long,
    val name: String,
)