package com.example.agrognom.domain.usecase.field

import com.example.agrognom.domain.model.Field
import com.example.agrognom.domain.model.FieldCreate
import com.example.agrognom.domain.repository.FieldRepository

class CreateFieldUseCase(
    private val repository: FieldRepository
) {
    suspend operator fun invoke(create: FieldCreate): Field {
        return repository.createField(create)
    }
}