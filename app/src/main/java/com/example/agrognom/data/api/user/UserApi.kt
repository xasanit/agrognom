package com.example.agrognom.data.api.user

import com.example.agrognom.data.dto.response.UserResponse

interface UserApi {

    suspend fun getUser(): UserResponse

}