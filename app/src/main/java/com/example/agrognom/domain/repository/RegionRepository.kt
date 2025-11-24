package com.example.agrognom.domain.repository

import com.example.agrognom.domain.model.Region

interface RegionRepository {

    suspend fun getRegion(id: Long): Region

    suspend fun getRegions(): List<Region>
}