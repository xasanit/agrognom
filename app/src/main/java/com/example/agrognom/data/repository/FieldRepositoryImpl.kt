package com.example.agrognom.data.repository

import com.example.agrognom.data.local.authRequest
import com.example.agrognom.data.mapper.toDomain
import com.example.agrognom.data.mapper.toDto
import com.example.agrognom.data.remote.api.field.FieldApi
import com.example.agrognom.domain.model.Field
import com.example.agrognom.domain.model.FieldCreate
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.FieldRepository

class FieldRepositoryImpl(
    private val api: FieldApi,
    private val authRepository: AuthRepository
): FieldRepository {

    override suspend fun getField(id: Long): Field {
        return authRequest(authRepository) {
            api.getField(id)
        }.toDomain()
    }

    override suspend fun getFields(): List<Field> {
        return authRequest(authRepository) {
            api.getFields()
        }.map { it.toDomain() }
    }

    override suspend fun createField(fieldCreateEntity: FieldCreate): Field {
        return authRequest(authRepository) {
            api.createField(fieldCreateEntity.toDto())
        }.toDomain()
    }

    override suspend fun deleteField(id: Long) {
        authRequest(authRepository) {
            api.deleteField(id)
        }
    }

}