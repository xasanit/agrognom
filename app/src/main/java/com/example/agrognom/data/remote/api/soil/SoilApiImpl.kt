package com.example.agrognom.data.remote.api.soil

import com.example.agrognom.data.remote.dto.response.SoilResponse
import com.example.agrognom.domain.repository.AuthRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class SoilApiImpl(
    val client: HttpClient,
    val baseUrl: String,
    val authRepository: AuthRepository
): SoilApi {
    override suspend fun getSoils(): List<SoilResponse> {
        return client.get("${baseUrl}/soils").body()
    }

    override suspend fun getSoil(id: Long): SoilResponse {
        return client.get("${baseUrl}/soils/${id}").body()
    }

}