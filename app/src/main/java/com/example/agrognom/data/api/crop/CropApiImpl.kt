package com.example.agrognom.data.api.crop

import com.example.agrognom.data.dto.response.CropResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class CropApiImpl(
    val client: HttpClient,
    val baseUrl: String,
): CropApi {

    override suspend fun getCrops(): List<CropResponse> {
        return client.get("${baseUrl}/crops").body()
    }

    override suspend fun getCrop(id: Long): CropResponse {
        return client.get("${baseUrl}/${id}").body()
    }
}