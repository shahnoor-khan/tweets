package com.example.tweet

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tweet.data.cardtweet
import com.example.tweet.navigation.Screen
import com.example.tweet.presentation.components.IconImage
import com.example.tweet.presentation.components.Username
import com.example.tweet.ui.theme.blue



@Composable
fun Tweet(
    modifier: Modifier= Modifier,
    tweet:cardtweet,
    navController: NavController?
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
        Spacer(modifier = Modifier.height(5.dp))
        if (tweet.imageURIs?.isEmpty() == true || tweet.videoURI==null){
            LazyRow(modifier=Modifier.fillMaxWidth()) {
                tweet.imageURIs?.let {
                    items(it.toArray()){
                        Image(modifier = Modifier
                            .size(240.dp)
                            .shadow(1.dp, shape = RoundedCornerShape(10.dp))
                            ,painter = painterResource(id = it as Int),
                            contentDescription = "Image",
                            contentScale = ContentScale.Crop,
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                    }
                }
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
                    likesOrComment = tweet.noOfLikes,
                    painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                    Style = TextStyle(color = Color.Black,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium
                ), navcontroller = null
                )



            iconAndType(
                modifier = Modifier.fillMaxWidth(1f),
                "Comments",
                likesOrComment = tweet.noOfComments,
                painter = painterResource(id = R.drawable.outline_chat_bubble_outline_24),
                Style = TextStyle(color = Color.Black,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                ), navcontroller = navController
            )


            iconAndType(
                modifier = Modifier.fillMaxWidth(1f),
                "Share",
                Style = TextStyle(color = Color.Black,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                ),
                painter = painterResource(id = R.drawable.baseline_share_24),
                likesOrComment = null,
                navcontroller= null

            )
        }
        Divider(thickness = 1.dp)
    }

}
@Composable
fun iconAndType(
    modifier: Modifier=Modifier,
    type:String,
    Style: TextStyle,
    likesOrComment: String?,
    painter: Painter?,
    navcontroller:NavController?
){
    Row(modifier=Modifier,
        Arrangement.SpaceAround,
        Alignment.CenterVertically
    ) {
        if (painter != null) {
            Icon(
                painter = painter,
                contentDescription = "likes",

                )
        }
        Spacer(modifier = Modifier.width(5.dp))
        if (likesOrComment != null) {
            Text(
                text = likesOrComment,
                color = Color.Black,
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Text(
            modifier = Modifier
                .padding(2.dp)
                .clickable { navcontroller?.navigate(Screen.Comments.route) },
            style =Style,
            text = type
        )

    }

}

@Preview(showBackground = true)
@Composable
fun Tweet() {
    Tweet(Modifier,
        cardtweet("123","raunak",R.drawable.icon_image,"Question"," Hi I\'m raunak how are you?",
            arrayListOf(R.drawable.guyworking2, R.drawable.guyworking),null,"120","123"), navController = null
    )
}



