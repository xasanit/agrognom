package com.example.agrognom.domain.usecase.field

import com.example.agrognom.domain.model.Field
import com.example.agrognom.domain.repository.FieldRepository

class GetFieldsUseCase(
    private val repository: FieldRepository
) {

    suspend operator fun invoke(): List<Field> {
        return repository.getFields()
    }
}