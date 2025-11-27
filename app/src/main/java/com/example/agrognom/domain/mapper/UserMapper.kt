package com.example.agrognom.domain.mapper

import com.example.agrognom.data.dto.response.UserResponse
import com.example.agrognom.domain.model.User

fun UserResponse.toDomain(): User {
    return User(
        username = username,
        email = email,
    )
}