package com.example.apipinteres.models.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    @SerialName("hits")
    var hits: List<Hit?>? = null,
    @SerialName("total")
    var total: Int? = null,
    @SerialName("totalHits")
    var totalHits: Int? = null
)