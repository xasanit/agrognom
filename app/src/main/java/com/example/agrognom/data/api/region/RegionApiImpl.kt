package com.example.agrognom.data.api.region

import com.example.agrognom.data.dto.response.RegionResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class RegionApiImpl(
    val client: HttpClient,
    val baseUrl: String
): RegionApi {

    override suspend fun getRegions(): List<RegionResponse> {
        return client.get("${baseUrl}/regions").body()
    }

    override suspend fun getRegion(id: Long): RegionResponse {
        return client.get("${baseUrl}/regions/${id}").body()
    }
}