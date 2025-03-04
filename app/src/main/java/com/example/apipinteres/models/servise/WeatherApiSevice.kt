package com.example.apipinteres.models.servise

import com.example.apipinteres.models.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiSevice {
    @GET("http://api.weatherapi.com/v1/current.json?")
    suspend fun getTemperature(
        @Query("key") apiKey: String,
        @Query("q") query: String,
    ): WeatherResponse
}