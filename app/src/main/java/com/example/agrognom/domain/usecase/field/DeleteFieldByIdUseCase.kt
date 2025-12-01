package com.example.agrognom.domain.usecase.field

import com.example.agrognom.domain.repository.FieldRepository

class DeleteFieldByIdUseCase(
    private val repository: FieldRepository
) {
    suspend operator fun invoke(id: Long) {
        repository.deleteField(id)
    }
}