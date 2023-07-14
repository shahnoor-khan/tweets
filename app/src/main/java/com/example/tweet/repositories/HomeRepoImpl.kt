package com.example.tweet.repositories

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.tweet.data.cardtweet
import com.example.tweet.paging.HomePaginationSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

@ExperimentalPagingApi
class HomeRepoImpl: HomeRepo {


    override suspend fun gettweets(): Flow<PagingData<cardtweet>> {
        return withContext(Dispatchers.Default){
                return@withContext Pager(
                    config = PagingConfig(pageSize = 3),
                    pagingSourceFactory = {
                        HomePaginationSource()
                    }
                ).flow
        }
    }
}