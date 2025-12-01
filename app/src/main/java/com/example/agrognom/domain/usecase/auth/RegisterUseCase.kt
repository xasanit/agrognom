package com.example.agrognom.domain.usecase.auth

import com.example.agrognom.domain.repository.AuthRepository

class RegisterUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(username: String, password: String, email: String?): Boolean {
        val tokens = repository.register(username, password, email)
        return tokens.accessToken.isNotEmpty()
    }
}