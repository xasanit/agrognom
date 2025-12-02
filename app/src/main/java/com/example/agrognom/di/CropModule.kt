package com.example.agrognom.di

import com.example.agrognom.data.remote.api.crop.CropApi
import com.example.agrognom.data.remote.api.crop.CropApiImpl
import com.example.agrognom.data.repository.CropRepositoryImpl
import com.example.agrognom.domain.repository.CropRepository
import com.example.agrognom.domain.usecase.crop.GetCropByIdUseCase
import com.example.agrognom.domain.usecase.crop.GetCropsUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val cropModule = module {

    single<CropApi> { CropApiImpl(get(), get(named("baseUrl"))) }

    single<CropRepository> { CropRepositoryImpl(get(), get()) }

    factory { GetCropByIdUseCase(get()) }
    factory { GetCropsUseCase(get()) }

}