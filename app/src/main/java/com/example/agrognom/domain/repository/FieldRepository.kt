package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Field
import com.example.agrognom.domain.model.FieldCreateEntity

interface FieldRepository {

    suspend fun getField(id: Long): Field

    suspend fun getFields(): List<Field>

    suspend fun createField(fieldCreateEntity: FieldCreateEntity): Field

    suspend fun deleteField(id: Long)

}