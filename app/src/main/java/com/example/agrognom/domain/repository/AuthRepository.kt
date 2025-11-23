package com.example.agrognom.domain.repository

import com.example.agrognom.data.dto.response.TokenResponse

interface AuthRepository {

    suspend fun login(username: String, password: String): TokenResponse

    suspend fun register(username: String, password: String, email: String?): TokenResponse

    suspend fun refresh(): TokenResponse?

    suspend fun logout()
}