package com.example.mymemory.models

data class MemoryCard (
    val identifier: Int,
    val imagesUrl: String? = null,
    var isFacedUp: Boolean = false,
    var isMatched: Boolean = false
)