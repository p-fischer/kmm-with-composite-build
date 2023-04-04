package com.example.kmmsampleapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform