package com.example.agrognom.data.mapper

import com.example.agrognom.data.remote.dto.response.UserResponse
import com.example.agrognom.domain.model.User

fun UserResponse.toDomain(): User {
    return User(
        username = username,
        email = email,
    )
}