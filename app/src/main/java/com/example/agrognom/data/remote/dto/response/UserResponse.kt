package com.example.agrognom.data.remote.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val username: String,
    val email: String,
)