package com.example.agrognom.data.remote.api.auth

import com.example.agrognom.data.remote.dto.request.AuthRequest
import com.example.agrognom.data.remote.dto.request.RefreshRequest
import com.example.agrognom.data.remote.dto.response.TokenResponse

interface AuthenticationApi {

    suspend fun register(request: AuthRequest): TokenResponse

    suspend fun login(request: AuthRequest): TokenResponse

    suspend fun refresh(request: RefreshRequest): TokenResponse

}