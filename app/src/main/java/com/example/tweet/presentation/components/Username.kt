package com.example.tweet.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tweet.R
import com.example.tweet.data.cardtweet
import com.example.tweet.ui.theme.TweetTheme
import com.example.tweet.ui.theme.blue
import com.example.tweet.ui.theme.lightBlue


@Composable
fun Username(
    modifier: Modifier =Modifier,
    tweet:cardtweet
){  Row(modifier=modifier) {
    Column(
        modifier = Modifier,
        Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .heightIn(12.dp,20.dp) ,
            text = tweet.Username,
            color = Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "2 hours ago",
            fontSize = 11.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Thin
        )
    }
    Spacer(modifier = Modifier.
    fillMaxWidth(0.1f)
    )
    Box(modifier = Modifier
        .background(color = lightBlue, RoundedCornerShape(8.dp))
        .shadow(1.dp)
    ){
        tweet.postType?.let {
            Text(
                modifier=Modifier.padding(8.dp),
                text = it,
                color = blue,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center

            )
        }
    }
}
}
@Preview(showBackground = true)
@Composable
fun username() {
    TweetTheme {
        Username(Modifier,
            cardtweet("123","raunak",R.drawable.icon_image,"Question"," Hi I\'m raunak how are you?",null,null,"120","123")
        )
    }
}