package com.example.cleanarchcryptoapp.presentation.coin_list

import com.example.cleanarchcryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
