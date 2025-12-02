package com.example.agrognom.data.repository

import com.example.agrognom.data.local.authRequest
import com.example.agrognom.data.mapper.toDomain
import com.example.agrognom.data.remote.api.user.UserApi
import com.example.agrognom.domain.model.User
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.repository.UserRepository

class UserRepositoryImpl(
    private val api: UserApi,
    private val authRepository: AuthRepository,
): UserRepository {

    override suspend fun getUser(): User {
        return authRequest(authRepository) {
            api.getUser()
        }.toDomain()
    }
}