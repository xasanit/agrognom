package com.example.agrognom.data.remote.api.recommendation

import com.example.agrognom.data.remote.dto.response.RecommendationResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class RecommendationApiImpl(
    val client: HttpClient,
    val baseUrl: String
) : RecommendationApi {

    override suspend fun getRecommendation(fieldId: Long): RecommendationResponse {
        return client.get("${baseUrl}/recommendation/${fieldId}").body()
    }
}