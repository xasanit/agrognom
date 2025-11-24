package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Soil

interface SoilRepository {

    suspend fun getSoils(): List<Soil>

    suspend fun getSoil(id: Long): Soil

}