package com.example.tweet.di

import androidx.paging.ExperimentalPagingApi
import com.example.tweet.repositories.HomeRepo
import com.example.tweet.repositories.HomeRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
object HomeModule {

    @OptIn(ExperimentalPagingApi::class)
    @Provides
    @ViewModelScoped
    fun homemodule() = HomeRepoImpl() as HomeRepo
}