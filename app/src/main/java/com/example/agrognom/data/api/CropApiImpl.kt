package com.example.agrognom.data.api

import com.example.agrognom.data.dto.response.CropResponse
import com.example.agrognom.data.tokenStorage.TokenStorage
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.header

class CropApiImpl(
    val client: HttpClient,
    val baseUrl: String,
    val tokenStorage: TokenStorage
): Crop {

    override suspend fun getCrops(): List<CropResponse> {
        return client.get("${baseUrl}/crops").body()
    }

    override suspend fun getCrop(id: Long): CropResponse {
        return client.get("${baseUrl}/${id}").body()
    }
}