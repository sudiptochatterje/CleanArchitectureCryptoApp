package com.example.cleanarchcryptoapp.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.example.cleanarchcryptoapp.domain.model.Coin

data class CoinDto(@SerializedName("symbol")
                   val symbol: String = "",
                   @SerializedName("is_active")
                   val isActive: Boolean = false,
                   @SerializedName("is_new")
                   val isNew: Boolean = false,
                   @SerializedName("name")
                   val name: String = "",
                   @SerializedName("rank")
                   val rank: Int = 0,
                   @SerializedName("id")
                   val id: String = "",
                   @SerializedName("type")
                   val type: String = "")

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}


