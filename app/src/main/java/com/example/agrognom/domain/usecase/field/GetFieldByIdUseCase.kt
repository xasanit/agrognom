package com.example.agrognom.domain.usecase.field

import com.example.agrognom.domain.model.Field
import com.example.agrognom.domain.repository.FieldRepository

class GetFieldByIdUseCase(
    private val repository: FieldRepository
) {
    suspend operator fun invoke(id: Long): Field {
        return repository.getField(id)
    }
}