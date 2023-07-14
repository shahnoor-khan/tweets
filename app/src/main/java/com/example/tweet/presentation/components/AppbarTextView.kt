package com.example.tweet.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tweet.Greeting
import com.example.tweet.R
import com.example.tweet.ui.theme.TweetTheme
import com.example.tweet.ui.theme.blue
import com.example.tweet.ui.theme.lightBlue


@Composable
fun TabTextView(
    modifier: Modifier= Modifier,
    text:String="charcha"
){
    Box(modifier = Modifier,
        Alignment.Center
    ) {
        Text(
            text = text,
            color = blue,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
            )
    }
}


@Preview(showBackground = true)
@Composable
fun TabTextView() {
    TweetTheme {
        TabTextView(modifier = Modifier,"Charcha")
    }
}