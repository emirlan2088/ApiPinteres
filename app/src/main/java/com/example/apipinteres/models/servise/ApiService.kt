package com.example.apipinteres.models.servise

import com.example.apipinteres.models.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/?")
    suspend fun getImages(
        @Query("key") apiKey: String,
        @Query("q") query: String,
    ):ApiResponse
}