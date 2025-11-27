package com.example.agrognom.data.api.field

import com.example.agrognom.data.dto.request.FieldCreateRequest
import com.example.agrognom.data.dto.response.FieldResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.http.Url

class FieldApiImpl (
    val client: HttpClient,
    val baseUrl: Url
): FieldApi {

    override suspend fun getField(id: Long): FieldResponse {
        return client.get("${baseUrl}/${id}").body()
    }

    override suspend fun getFields(): List<FieldResponse> {
        return client.get("${baseUrl}/fields").body()
    }

    override suspend fun createField(fieldCreateRequest: FieldCreateRequest): FieldResponse {
        return client.post("${baseUrl}/create").body()
    }

    override suspend fun deleteField(id: Long) {
        client.delete("${baseUrl}/delete")
    }
}