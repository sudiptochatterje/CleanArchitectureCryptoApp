package com.example.cleanarchcryptoapp.domain.use_case.get_coins

import com.example.cleanarchcryptoapp.common.Resource
import com.example.cleanarchcryptoapp.data.remote.dto.toCoin
import com.example.cleanarchcryptoapp.domain.model.Coin
import com.example.cleanarchcryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val rerepository: CoinRepository
){
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow{

        try{
            emit(Resource.Loading<List<Coin>>())
            val coins = rerepository.getCoins().map{ it.toCoin()}
            emit(Resource.Success<List<Coin>>(coins))
        }catch(e: HttpException){
            emit(Resource.Error<List<Coin>>(e.localizedMessage?:"An unexpected error occoured"))
        }catch(e: IOException){
            emit(Resource.Error<List<Coin>>("Couldn't reach server"))
        }
    }
}