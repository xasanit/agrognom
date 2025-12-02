package com.example.agrognom.di

import com.example.agrognom.data.remote.api.auth.AuthenticationApi
import com.example.agrognom.data.remote.api.auth.AuthenticationApiImpl
import com.example.agrognom.data.repository.AuthRepositoryImpl
import com.example.agrognom.domain.repository.AuthRepository
import com.example.agrognom.domain.usecase.auth.LoginUseCase
import com.example.agrognom.domain.usecase.auth.LogoutUseCase
import com.example.agrognom.domain.usecase.auth.RegisterUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val authModule = module {

    single<AuthenticationApi> { AuthenticationApiImpl(get(), get(named("baseUrl"))) }

    single<AuthRepository> { AuthRepositoryImpl(get(), get()) }

    factory { LoginUseCase(get()) }
    factory { LogoutUseCase(get()) }
    factory { RegisterUseCase(get()) }
}