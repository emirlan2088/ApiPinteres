package com.example.apipinteres.models.repository

import com.example.apipinteres.models.core.Either
import com.example.apipinteres.models.model.ApiResponse
import com.example.apipinteres.models.servise.ApiService
import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService){

    suspend fun getImages(apiKey: String, query: String ): Either<Throwable, ApiResponse> {
        return try {
            val response = apiService.getImages(apiKey, query)
            Either.Success(response)
        } catch (e: Exception) {
            Either.Error(e)
        }
    }
}