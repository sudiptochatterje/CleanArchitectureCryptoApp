package com.example.cleanarchcryptoapp.domain.repository

import com.example.cleanarchcryptoapp.data.remote.dto.CoinDetailDto
import com.example.cleanarchcryptoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}