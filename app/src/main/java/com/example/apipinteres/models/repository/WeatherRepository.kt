package com.example.apipinteres.models.repository

import com.example.apipinteres.models.core.Either
import com.example.apipinteres.models.model.WeatherResponse
import com.example.apipinteres.models.servise.WeatherApiSevice
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiService: WeatherApiSevice) {
    suspend fun getTemperature(apiKey: String, query: String): Either<Throwable, WeatherResponse> =
        try {
            val response = apiService.getTemperature(apiKey, query)
            Either.Success(response)
        } catch (e: Exception) {
            Either.Error(e)
        }

}