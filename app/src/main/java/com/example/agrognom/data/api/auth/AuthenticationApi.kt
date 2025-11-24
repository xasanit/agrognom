package com.example.agrognom.data.api.auth

import com.example.agrognom.data.dto.request.AuthRequest
import com.example.agrognom.data.dto.request.RefreshRequest
import com.example.agrognom.data.dto.response.TokenResponse

interface AuthenticationApi {

    suspend fun register(request: AuthRequest): TokenResponse

    suspend fun login(request: AuthRequest): TokenResponse

    suspend fun refresh(request: RefreshRequest): TokenResponse

}