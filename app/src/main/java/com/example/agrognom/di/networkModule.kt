package com.example.agrognom.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.example.agrognom.data.local.datastore.TokenStorage
import com.example.agrognom.data.remote.api.auth.AuthenticationApi
import com.example.agrognom.data.remote.api.auth.AuthenticationApiImpl
import com.example.agrognom.data.remote.client.provideHttpClient
import com.example.agrognom.data.repository.AuthRepositoryImpl
import io.ktor.client.HttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module

val networkModule = module {

    single<DataStore<Preferences>> { androidContext().dataStore }
    single { TokenStorage(get()) }
    single<String>(named("baseUrl")) { "http://localhost:8080/api" }
    single<HttpClient> { provideHttpClient(get()) } // зависит только от TokenStorage
    single<AuthenticationApi> { AuthenticationApiImpl(get(), get(named("baseUrl"))) }
    single { AuthRepositoryImpl(get(), get()) }

}