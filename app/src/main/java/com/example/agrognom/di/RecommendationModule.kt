package com.example.agrognom.di

import com.example.agrognom.data.remote.api.recommendation.RecommendationApi
import com.example.agrognom.data.remote.api.recommendation.RecommendationApiImpl
import com.example.agrognom.data.repository.RecommendationRepositoryImpl
import com.example.agrognom.domain.repository.RecommendationRepository
import com.example.agrognom.domain.usecase.recommendation.GetRecommendationUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val recommendationModule = module {

    single<RecommendationApi> { RecommendationApiImpl(get(), get(named("baseUrl"))) }
    single<RecommendationRepository> { RecommendationRepositoryImpl(get(), get()) }

    factory { GetRecommendationUseCase(get()) }
}