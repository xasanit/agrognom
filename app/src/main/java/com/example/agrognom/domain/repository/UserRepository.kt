package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.User

interface UserRepository {
    suspend fun getUser(): User
}