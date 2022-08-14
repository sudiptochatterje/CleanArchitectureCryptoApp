package com.example.cleanarchcryptoapp.domain.model

import com.google.gson.annotations.SerializedName

data class Coin(
    val symbol: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val id: String
)
