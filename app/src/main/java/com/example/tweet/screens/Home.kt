package com.example.tweet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.example.tweet.Tabs
import com.example.tweet.Tweet
import com.example.tweet.viewmodels.ViewModel



@OptIn(ExperimentalPagingApi::class)
@Composable
fun Home(
    modifier: Modifier=Modifier,
    navController: NavHostController?,
    homeviewmodel: ViewModel = hiltViewModel()
){
    homeviewmodel.gettweets()
    val tweet = homeviewmodel.tweetD.collectAsLazyPagingItems()

    Column {
        Tabs(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)

        )
        Divider(Modifier.fillMaxWidth(),1.dp)
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(all = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)){
            items(items = tweet){
                    unsplashImage ->
                unsplashImage?.let { Tweet(tweet = it, navController = navController)
                }
        }
    }

}}


@Preview(showBackground = true)
@Composable
@ExperimentalPagingApi
fun Home() {
//   Home(Modifier,null, null)
}


