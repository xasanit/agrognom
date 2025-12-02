package com.example.agrognom.di

import com.example.agrognom.data.remote.api.soil.SoilApi
import com.example.agrognom.data.remote.api.soil.SoilApiImpl
import com.example.agrognom.data.repository.SoilRepositoryImpl
import com.example.agrognom.domain.repository.SoilRepository
import com.example.agrognom.domain.usecase.soil.GetSoilByIdUseCase
import com.example.agrognom.domain.usecase.soil.GetSoilsUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val soilModule = module {

    single<SoilApi> { SoilApiImpl(get(), get(named("baseUrl"))) }
    single<SoilRepository> { SoilRepositoryImpl(get(), get()) }

    factory { GetSoilByIdUseCase(get()) }
    factory { GetSoilsUseCase(get()) }

}