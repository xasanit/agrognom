package com.example.agrognom.data.remote.api.field

import com.example.agrognom.data.remote.dto.request.FieldCreateRequest
import com.example.agrognom.data.remote.dto.response.FieldResponse

interface FieldApi {

    suspend fun getField(id: Long): FieldResponse

    suspend fun getFields(): List<FieldResponse>

    suspend fun createField(fieldCreateRequest: FieldCreateRequest): FieldResponse

    suspend fun deleteField(id: Long)

}