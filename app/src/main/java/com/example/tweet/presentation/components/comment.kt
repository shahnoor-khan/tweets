package com.example.tweet.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tweet.R
import com.example.tweet.data.cardtweet
import com.example.tweet.iconAndType
import com.example.tweet.ui.theme.blue

@Composable
fun Comment(
    modifier: Modifier = Modifier,
    tweet: cardtweet
){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
    ) {
        Row(Modifier.fillMaxWidth()){
            IconImage(Modifier.weight(0.2f), painterResource(id = R.drawable.icon_image))
            Spacer(modifier = Modifier.weight(0.05f))
            Username(Modifier.weight(1f),tweet)
            Icon(painter = painterResource(id = R.drawable.baseline_more_horiz_24), contentDescription = "menu")
        }
        Spacer(modifier = Modifier.heightIn(10.dp,25.dp))
        Text(
            text = tweet.text,
            color = blue,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
        )
        if (tweet.imageURIs?.isEmpty() == true || tweet.videoURI==null){
            Row() {
            }
        }
        Spacer(modifier = Modifier.heightIn(10.dp,25.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(0.dp, 5.dp, 0.dp, 5.dp),
            Arrangement.SpaceBetween) {

            iconAndType(
                modifier = Modifier.fillMaxWidth(1f),
                "likes",
                Style = TextStyle(color = Color.Black,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                ),
                likesOrComment = tweet.noOfLikes,
                painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                navcontroller = null
            )
        }
        Divider(thickness = 1.dp)
    }

}