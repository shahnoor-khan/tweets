package com.example.tweet.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingData
import com.example.tweet.data.cardtweet
import com.example.tweet.repositories.HomeRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class ViewModel @Inject constructor(
    private val repository:HomeRepo
) :ViewModel(){
    private val tweetsData = MutableStateFlow<PagingData<cardtweet>>(PagingData.empty())
    val tweetD = tweetsData

    fun gettweets(){
        viewModelScope.launch {
            repository.gettweets().collect{
                tweetD.value= it
            }
        }
    }

}