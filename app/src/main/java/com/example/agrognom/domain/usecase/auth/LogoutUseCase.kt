package com.example.agrognom.domain.usecase.auth

import com.example.agrognom.domain.repository.AuthRepository

class LogoutUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke() {
        repository.logout()
    }
}