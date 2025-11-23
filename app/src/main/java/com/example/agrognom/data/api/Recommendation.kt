package com.example.agrognom.data.api

interface Recommendation {

    fun getRecommendation(fieldId: Long): String

}