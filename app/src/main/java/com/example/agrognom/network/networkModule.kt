package com.example.agrognom.network

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.example.agrognom.data.api.Authentication
import com.example.agrognom.data.api.AuthenticationApiImpl
import com.example.agrognom.data.repository.AuthRepositoryImpl
import com.example.agrognom.data.tokenStorage.TokenStorage
import com.example.agrognom.data.tokenStorage.dataStore
import io.ktor.client.HttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module

val networkModule = module {

    single<DataStore<Preferences>> { androidContext().dataStore }
    single { TokenStorage(get()) }
    single<String>(named("baseUrl")) { "http://localhost:8080/api" }
    single<HttpClient> { provideHttpClient(get()) } // зависит только от TokenStorage
    single<Authentication> { AuthenticationApiImpl(get(), get(named("baseUrl"))) }
    single { AuthRepositoryImpl(get(), get()) }

}