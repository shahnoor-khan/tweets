package com.example.tweet.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.tweet.data.cardtweet
import com.example.tweet.data.data

class HomePaginationSource(): PagingSource<Int, cardtweet>() {
    override fun getRefreshKey(state: PagingState<Int, cardtweet>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, cardtweet> {
        val currentPage = params.key ?: 1
        val prePage =  if (currentPage == 1) 0 else currentPage - 1
        val nextPage=  if (data.size == currentPage*3) 0 else currentPage + 1
        return try {

            if (data.size != currentPage*3){
            LoadResult.Page(
                data = data.subList(prePage,nextPage),
                prevKey = prePage,
                nextKey = nextPage
            )

        }else{
                LoadResult.Page(
                    data = emptyList(),
                    prevKey = null,
                    nextKey = null)
            }
        }
        catch (e:Exception){
            LoadResult.Error(e)
        }
    }
}