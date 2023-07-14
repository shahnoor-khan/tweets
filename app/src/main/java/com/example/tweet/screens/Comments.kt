package com.example.tweet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tweet.R
import com.example.tweet.Tweet
import com.example.tweet.data.cardtweet
import com.example.tweet.iconAndType
import com.example.tweet.presentation.components.Comment
import com.example.tweet.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommentsPage(
    navController: NavController?
) {
    Column {
        TopAppBar(
            title = { Text(modifier = Modifier.padding(start = 20.dp), text = "Comments") },
            navigationIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                    contentDescription = "back"
                )
            },
        )
        Tweet(
            tweet = cardtweet(
                "123",
                "raunak",
                R.drawable.icon_image,
                "Question",
                " Hi I\'m raunak how are you? what about you \n anyone wanna join me today? \n im going for a movie. ",
                null,
                null,
                "120",
                "123"
            ), navController = null
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            Arrangement.SpaceBetween
        ) {
            iconAndType(
                painter = null, Style = TextStyle(
                    color = Color.Black,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                ), type = "comments", likesOrComment = "167", navcontroller = null
            )
            iconAndType(
                type = "Recent", likesOrComment = null,
                painter = painterResource(id = R.drawable.baseline_filter_list_24),
                Style = TextStyle(
                    color = blue,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                ), navcontroller = null
            )
        }

        Comment(
            tweet = cardtweet(
                "123",
                "raunak",
                R.drawable.icon_image,
                null,
                " Hi I\'m raunak how are you? what about you \n anyone wanna join me today? \n im going for a movie. ",
                null,
                null,
                null,
                null
            )
        )
        Comment(
            tweet = cardtweet(
                "123",
                "raunak",
                R.drawable.icon_image,
                null,
                " Hi I\'m raunak how are you? what about you \n anyone wanna join me today? \n im going for a movie. ",
                null,
                null,
                "120",
                "123"
            )
        )

    }
}

@Preview(showBackground = true)
@Composable
fun Comments() {
    CommentsPage(null)
}