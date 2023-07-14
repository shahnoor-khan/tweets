package com.example.tweet

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tweet.presentation.components.TabTextView
import com.example.tweet.ui.theme.TweetTheme
import com.example.tweet.ui.theme.blue
import com.example.tweet.ui.theme.lightBlue


@Composable
fun Tabs(
    modifier: Modifier= Modifier
    ){
    var state by remember {
            mutableStateOf(0)
    }
    val array = arrayListOf("charcha","bazaar","profile")

    TabRow(modifier = modifier.padding(10.dp,0.dp,10.dp,0.dp), selectedTabIndex = state) {
        array.forEachIndexed { index, title ->
            Tab(
                selected = state == index,
                onClick = { state = index },
                text = { Text(text = title, maxLines = 2, overflow = TextOverflow.Ellipsis, color = Color.Gray) }
            )
        }
    }
    }


@Preview(showBackground = true)
@Composable
fun Tabs() {
    TweetTheme {
        Tabs(
            Modifier
                .height(50.dp)
                .background(MaterialTheme.colorScheme.background, RectangleShape))
    }
}