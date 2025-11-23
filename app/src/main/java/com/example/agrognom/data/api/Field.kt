package com.example.agrognom.data.api

import com.example.agrognom.data.dto.request.FieldCreateRequest
import com.example.agrognom.data.dto.response.FieldResponse

interface Field {

    suspend fun getField(id: Long): FieldResponse

    suspend fun getFields(): List<FieldResponse>

    suspend fun createField(fieldCreateRequest: FieldCreateRequest): FieldResponse

    suspend fun deleteField(id: Long)

}