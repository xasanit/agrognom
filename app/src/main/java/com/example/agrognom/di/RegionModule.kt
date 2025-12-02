package com.example.agrognom.di

import com.example.agrognom.data.remote.api.region.RegionApi
import com.example.agrognom.data.remote.api.region.RegionApiImpl
import com.example.agrognom.data.repository.RegionRepositoryImpl
import com.example.agrognom.domain.repository.RegionRepository
import com.example.agrognom.domain.usecase.region.GetRegionByIdUseCase
import com.example.agrognom.domain.usecase.region.GetRegionsUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val regionModule = module {

    single<RegionApi> { RegionApiImpl(get(), get(named("baseUrl"))) }
    single<RegionRepository> { RegionRepositoryImpl(get(), get()) }

    factory { GetRegionByIdUseCase(get()) }
    factory { GetRegionsUseCase(get()) }

}