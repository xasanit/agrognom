package com.example.agrognom.data.api.user

import com.example.agrognom.data.dto.response.UserResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class UserApiImpl(
    val client: HttpClient,
    val baseUrl: String
): UserApi {
    override suspend fun getUser(): UserResponse {
        return client.get("${baseUrl}/user").body()
    }
}