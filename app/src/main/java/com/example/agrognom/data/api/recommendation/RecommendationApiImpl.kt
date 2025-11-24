package com.example.agrognom.data.api.recommendation

import com.example.agrognom.data.dto.response.RecommendationResponse
import com.example.agrognom.data.tokenStorage.authRequest
import com.example.agrognom.domain.repository.AuthRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class RecommendationApiImpl(
    val client: HttpClient,
    val baseUrl: String,
    val authRepository: AuthRepository
) : RecommendationApi {

    override suspend fun getRecommendation(fieldId: Long): RecommendationResponse {
        return authRequest(authRepository) {
            client.get("${baseUrl}/recommendation/${fieldId}").body()
        }
    }
}