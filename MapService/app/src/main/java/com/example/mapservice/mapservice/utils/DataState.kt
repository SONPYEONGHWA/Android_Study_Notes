package com.example.mapservice.mapservice.utils

data class DataState <out T> (
    val status: Status,
    val data: T?,
    val message: String?
) {

    enum class Status {
        SUCCESS,
        LOADING,
        ERROR
    }

    companion object {
        fun <T> success(data: T?): DataState<T> {
            return DataState(Status.SUCCESS, data, null)
        }

        fun <T> loading(data: T?): DataState<T> {
            return DataState(Status.LOADING, data, null)
        }

        fun <T> error(data:T?, message: String): DataState<T> {
            return DataState(Status.ERROR, data, message)
        }
    }
}