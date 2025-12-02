package com.example.agrognom.di

import com.example.agrognom.data.remote.api.user.UserApi
import com.example.agrognom.data.remote.api.user.UserApiImpl
import com.example.agrognom.data.repository.UserRepositoryImpl
import com.example.agrognom.domain.repository.UserRepository
import com.example.agrognom.domain.usecase.user.GetCurrentUserUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val userModule = module {
    single<UserApi> { UserApiImpl(get(), get(named("baseUrl"))) }
    single<UserRepository> { UserRepositoryImpl(get(), get()) }

    factory { GetCurrentUserUseCase(get()) }
}