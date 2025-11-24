package com.example.agrognom.data.api.crop

import com.example.agrognom.data.dto.response.CropResponse
import com.example.agrognom.data.tokenStorage.authRequest
import com.example.agrognom.domain.repository.AuthRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class CropApiImpl(
    val client: HttpClient,
    val baseUrl: String,
    val authRepository: AuthRepository
): CropApi {

    override suspend fun getCrops(): List<CropResponse> {
        return authRequest(authRepository) {
            client.get("${baseUrl}/crops").body()
        }
    }

    override suspend fun getCrop(id: Long): CropResponse {
        return authRequest(authRepository) {
            client.get("${baseUrl}/${id}").body()
        }
    }
}