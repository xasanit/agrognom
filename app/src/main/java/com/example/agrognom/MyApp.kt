package com.example.agrognom

import android.app.Application
import com.example.agrognom.di.authModule
import com.example.agrognom.di.coreModule
import com.example.agrognom.di.cropModule
import com.example.agrognom.di.fieldModule
import com.example.agrognom.di.recommendationModule
import com.example.agrognom.di.regionModule
import com.example.agrognom.di.soilModule
import com.example.agrognom.di.userModule
import com.example.agrognom.di.weatherModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(
                coreModule,
                authModule,
                cropModule,
                fieldModule,
                recommendationModule,
                regionModule,
                soilModule,
                userModule,
                weatherModule,
            )
        }
    }
}