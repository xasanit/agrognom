package com.example.agrognom.data.api

import com.example.agrognom.data.dto.response.UserResponse

interface User {

    fun getUser(): UserResponse

}