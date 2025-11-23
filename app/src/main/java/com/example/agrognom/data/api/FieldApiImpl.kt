package com.example.agrognom.data.api

import com.example.agrognom.data.dto.request.FieldCreateRequest
import com.example.agrognom.data.dto.response.FieldResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.http.Url

class FieldApiImpl (
    val client: HttpClient,
    val baseUrl: Url,
): Field {

    override suspend fun getField(id: Long): FieldResponse {
        return client.get("${baseUrl}/${id}").body()
    }

    override suspend fun getFields(): List<FieldResponse> {
        return client.get("${baseUrl}/fields").body()
    }

    override suspend fun createField(fieldCreateRequest: FieldCreateRequest): FieldResponse {
        return client.post("${baseUrl}/create")
            .body()
    }

    override suspend fun deleteField(id: Long) {
        TODO("Not yet implemented")
    }

}