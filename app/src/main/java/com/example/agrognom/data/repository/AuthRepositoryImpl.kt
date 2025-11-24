package com.example.agrognom.data.repository

import com.example.agrognom.data.api.auth.AuthenticationApi
import com.example.agrognom.data.dto.request.AuthRequest
import com.example.agrognom.data.dto.request.RefreshRequest
import com.example.agrognom.data.dto.response.TokenResponse
import com.example.agrognom.data.tokenStorage.TokenStorage
import com.example.agrognom.domain.repository.AuthRepository
import kotlinx.coroutines.flow.first

class AuthRepositoryImpl(
    private val api: AuthenticationApi,
    private val storage: TokenStorage
): AuthRepository {

    override suspend fun login(username: String, password: String): TokenResponse {
        val response = api.login(AuthRequest(username, password))
        storage.saveTokens(response)
        return response
    }

    override suspend fun register(username: String, password: String, email: String?): TokenResponse {
        val response = api.register(AuthRequest(username, password, email))
        storage.saveTokens(response)
        return response
    }

    override suspend fun refresh(): TokenResponse? {
        val refreshToken = storage.refreshToken.first() ?: return null

        val response = api.refresh(RefreshRequest(refreshToken))
        storage.saveTokens(response)
        return response
    }

    override suspend fun logout() {
        storage.clear()
    }
}