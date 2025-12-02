package com.example.agrognom.data.remote.api.auth

import com.example.agrognom.data.remote.dto.request.AuthRequest
import com.example.agrognom.data.remote.dto.request.RefreshRequest
import com.example.agrognom.data.remote.dto.response.TokenResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody

class AuthenticationApiImpl(
    val client: HttpClient,
    val baseUrl: String,
): AuthenticationApi {

    override suspend fun register(request: AuthRequest): TokenResponse {
        return client.post("${baseUrl}/register"){
            setBody(request)
        }.body()
    }

    override suspend fun login(request: AuthRequest): TokenResponse {
        return client.post("${baseUrl}/login"){
            setBody(request)
        }.body()
    }

    override suspend fun refresh(request: RefreshRequest): TokenResponse {
        return client.post("${baseUrl}/refresh"){
            setBody(request)
        }.body()
    }
}