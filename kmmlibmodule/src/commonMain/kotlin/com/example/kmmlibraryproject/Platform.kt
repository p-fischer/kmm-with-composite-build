package com.example.kmmlibraryproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform