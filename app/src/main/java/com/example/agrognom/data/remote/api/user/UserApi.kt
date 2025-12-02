package com.example.agrognom.data.remote.api.user

import com.example.agrognom.data.remote.dto.response.UserResponse

interface UserApi {

    suspend fun getUser(): UserResponse

}