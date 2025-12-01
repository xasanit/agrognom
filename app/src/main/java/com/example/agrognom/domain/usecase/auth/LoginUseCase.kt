package com.example.agrognom.domain.usecase.auth

import com.example.agrognom.domain.repository.AuthRepository

class LoginUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(username: String, password: String): Boolean {
        val tokens = repository.login(username, password)
        return tokens.accessToken.isNotEmpty()
    }
}