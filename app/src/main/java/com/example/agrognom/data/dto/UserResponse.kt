package com.example.agrognom.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val username: String,
    val email: String,
)