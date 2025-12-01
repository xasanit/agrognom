package com.example.agrognom.domain.usecase.user

import com.example.agrognom.domain.model.User
import com.example.agrognom.domain.repository.UserRepository

class GetCurrentUserUseCase(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): User {
        return repository.getUser()
    }
}