package com.example.cleanarchcryptoapp.presentation.coin_detail

import com.example.cleanarchcryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
