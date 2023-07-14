package com.example.tweet.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tweet.ui.theme.TweetTheme
import com.example.tweet.ui.theme.blue
import com.example.tweet.ui.theme.lightBlue

@Composable
fun PostType(
    modifier: Modifier =Modifier,
    postType:String
){


}

@Preview(showBackground = true)
@Composable
fun PostType() {
    TweetTheme {
        PostType(modifier = Modifier.width(150.dp),"Question")
    }
}