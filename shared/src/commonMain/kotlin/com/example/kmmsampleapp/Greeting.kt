package com.example.kmmsampleapp

import com.example.kmmlibraryproject.Platform
import com.example.kmmlibraryproject.getPlatform

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}