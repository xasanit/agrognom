package com.example.agrognom.data.local

import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.data.local.exception.RefreshRequiredException

suspend inline fun <T> authRequest(
    repository: AuthRepository,
    crossinline block: suspend () -> T
): T {
    return try {
        block()
    } catch (e: RefreshRequiredException) {
        val refreshed = repository.refresh()
        if (refreshed == null) {
            throw Exception("Refresh token expired. User must login again.")
        }
        block()
    }
}