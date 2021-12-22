package com.example.apps_siadin.models.Request

data class RegisterRequest(
    val name: String,
    val nim: String,
    val email: String,
    val password: String,
)
