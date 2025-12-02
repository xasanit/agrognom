package com.example.agrognom.di

import com.example.agrognom.data.remote.api.weather.WeatherApi
import com.example.agrognom.data.remote.api.weather.WeatherApiImpl
import com.example.agrognom.data.repository.WeatherRepositoryImpl
import com.example.agrognom.domain.repository.WeatherRepository
import com.example.agrognom.domain.usecase.weather.GetCurrentWeatherUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val weatherModule = module {

    single<WeatherApi> { WeatherApiImpl(get(), get(named("baseUrl"))) }
    single<WeatherRepository> { WeatherRepositoryImpl(get(), get()) }

    factory { GetCurrentWeatherUseCase(get()) }

}