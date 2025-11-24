package com.example.agrognom.data.api.user

import com.example.agrognom.data.dto.response.UserResponse
import com.example.agrognom.data.tokenStorage.authRequest
import com.example.agrognom.domain.repository.AuthRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class UserApiImpl(
    val client: HttpClient,
    val baseUrl: String,
    val authRepository: AuthRepository
): UserApi {
    override suspend fun getUser(): UserResponse {
        return authRequest(authRepository) {
            client.get("${baseUrl}/user").body()
        }
    }
}