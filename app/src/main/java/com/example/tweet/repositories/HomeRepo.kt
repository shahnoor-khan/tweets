package com.example.tweet.repositories

import androidx.paging.PagingData
import com.example.tweet.data.cardtweet
import kotlinx.coroutines.flow.Flow

interface HomeRepo {
    suspend fun gettweets(): Flow<PagingData<cardtweet>>
}