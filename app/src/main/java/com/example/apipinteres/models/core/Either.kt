package com.example.apipinteres.models.core

sealed class Either<out L, out R> {

    data class Error<L>(val value: L) : Either<L, Nothing>()
    data class Success<R>(val value: R) : Either<Nothing, R>()
}