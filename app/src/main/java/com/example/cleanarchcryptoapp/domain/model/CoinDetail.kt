package com.example.cleanarchcryptoapp.domain.model

import com.example.cleanarchcryptoapp.data.remote.dto.TeamMember


data class CoinDetail(
    val coidId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
