package com.example.viamm.models

data class LoginResponse(val error: Boolean, val message: String, val user: User) {
}