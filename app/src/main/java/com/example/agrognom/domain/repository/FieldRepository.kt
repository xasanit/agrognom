package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Field
import com.example.agrognom.domain.model.FieldCreate

interface FieldRepository {

    suspend fun getField(id: Long): Field

    suspend fun getFields(): List<Field>

    suspend fun createField(fieldCreateEntity: FieldCreate): Field

    suspend fun deleteField(id: Long)

}