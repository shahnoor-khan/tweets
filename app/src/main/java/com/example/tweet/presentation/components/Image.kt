package com.example.tweet.presentation.components

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.createBitmap
import coil.compose.AsyncImage
import com.example.tweet.R
import com.example.tweet.ui.theme.TweetTheme


@Composable
fun IconImage(
    modifier: Modifier = Modifier,
    image:Painter
){
            Image(painter = image,
                "anime",
                    modifier = modifier.clip(CircleShape)
                        .size(50.dp),
                    contentScale = ContentScale.Crop)

}

@Preview(showBackground = false)
@Composable
fun IconImage() {
    TweetTheme {
        IconImage(modifier = Modifier.width(150.dp), painterResource(id = R.drawable.icon_image))
    }
}