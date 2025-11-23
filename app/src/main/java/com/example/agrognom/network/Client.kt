package com.example.agrognom.network

import com.example.agrognom.data.tokenStorage.TokenStorage
import com.example.agrognom.exception.RefreshRequiredException
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.HttpResponseValidator
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

fun provideHttpClient(
    storage: TokenStorage
): HttpClient {
    return HttpClient(OkHttp) {

        // JSON сериализация
        install(ContentNegotiation) {
            json()
        }

        // Добавляем access-token к каждому запросу
        defaultRequest {
            val token = runBlocking { storage.accessToken.first() }
            if (token != null) {
                header("Authorization", "Bearer $token")
            }
        }

        // Обработка 401
        HttpResponseValidator {
            handleResponseExceptionWithRequest { exception, _ ->
                if (exception is ClientRequestException && exception.response.status.value == 401) {
                    // Просто кидаем исключение
                    throw RefreshRequiredException()
                }
            }
        }
    }
}