package com.example.agrognom.di

import com.example.agrognom.data.remote.api.field.FieldApi
import com.example.agrognom.data.remote.api.field.FieldApiImpl
import com.example.agrognom.data.repository.FieldRepositoryImpl
import com.example.agrognom.domain.repository.FieldRepository
import com.example.agrognom.domain.usecase.field.CreateFieldUseCase
import com.example.agrognom.domain.usecase.field.DeleteFieldByIdUseCase
import com.example.agrognom.domain.usecase.field.GetFieldByIdUseCase
import com.example.agrognom.domain.usecase.field.GetFieldsUseCase
import org.koin.core.qualifier.named
import org.koin.dsl.module

val fieldModule = module {

    single<FieldApi> { FieldApiImpl(get(), get(named("baseUrl"))) }
    single<FieldRepository> { FieldRepositoryImpl(get(), get()) }

    factory { CreateFieldUseCase(get()) }
    factory { DeleteFieldByIdUseCase(get()) }
    factory { GetFieldByIdUseCase(get()) }
    factory { GetFieldsUseCase(get()) }

}