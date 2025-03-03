package com.example.apipinteres.models.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hit(
    @SerialName("collections")
    var collections: Int? = null,
    @SerialName("comments")
    var comments: Int? = null,
    @SerialName("downloads")
    var downloads: Int? = null,
    @SerialName("id")
    var id: Int? = null,
    @SerialName("imageHeight")
    var imageHeight: Int? = null,
    @SerialName("imageSize")
    var imageSize: Int? = null,
    @SerialName("imageWidth")
    var imageWidth: Int? = null,
    @SerialName("largeImageURL")
    var largeImageURL: String? = null,
    @SerialName("likes")
    var likes: Int? = null,
    @SerialName("pageURL")
    var pageURL: String? = null,
    @SerialName("previewHeight")
    var previewHeight: Int? = null,
    @SerialName("previewURL")
    var previewURL: String? = null,
    @SerialName("previewWidth")
    var previewWidth: Int? = null,
    @SerialName("tags")
    var tags: String? = null,
    @SerialName("type")
    var type: String? = null,
    @SerialName("user")
    var user: String? = null,
    @SerialName("user_id")
    var userId: Int? = null,
    @SerialName("userImageURL")
    var userImageURL: String? = null,
    @SerialName("views")
    var views: Int? = null,
    @SerialName("webformatHeight")
    var webformatHeight: Int? = null,
    @SerialName("webformatURL")
    var webformatURL: String? = null,
    @SerialName("webformatWidth")
    var webformatWidth: Int? = null
)