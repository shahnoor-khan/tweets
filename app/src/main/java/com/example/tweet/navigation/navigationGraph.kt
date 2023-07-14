package com.example.tweet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import com.example.tweet.screens.CommentsPage
import com.example.tweet.screens.Home

@ExperimentalPagingApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            Home(navController = navController)
        }
        composable(route = Screen.Comments.route){
            CommentsPage(navController = navController)
        }
    }
}