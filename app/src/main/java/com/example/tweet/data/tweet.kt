package com.example.tweet.data

import com.example.tweet.R


data class cardtweet(
    val uid:String,
    val Username:String,
    val ImageIcon:Int,
    val postType:String?,
    val text:String,
    val imageURIs:ArrayList<Int>?,
    val videoURI:String?,
    val noOfLikes:String?,
    val noOfComments:String?
)

val data = listOf<cardtweet>(
    cardtweet(
        uid="12",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>(R.drawable.guyworking, R.drawable.guyworking2,R.drawable.guyworking3),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="11",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>(),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="10",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>(),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="9",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>(R.drawable.guyworking3, R.drawable.guyworking2),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="8",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>(),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="7",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="6",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="5",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="4",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="3",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="2",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="1",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = arrayListOf<Int>( ),
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    )

)

val comment= arrayListOf<cardtweet>(
    cardtweet(
        uid="1",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = null,
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="2",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = null,
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="3",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = null,
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    ),
    cardtweet(
        uid="4",
        Username = "Abhisek",
        ImageIcon = R.drawable.icon_image,
        postType= "Question",
        text= "Hi, I\'m raunak working as an full time engineer, Any one likes to join my journey ping me on discord",
        imageURIs = null,
        videoURI = null,
        noOfLikes = "123",
        noOfComments = "67"
    )
)
