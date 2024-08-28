package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card.ui.theme.Business_CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Business_CardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(
            color = Color.LightGray
        )
    ) {
        NameInfo(
            modifier
                .align(alignment = Alignment.CenterHorizontally),
            Color.Black
        )
        Spacer(modifier.height(70.dp))
        Contact(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun NameInfo(modifier: Modifier, textColor: Color) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(120.dp)
                .background(
                    color = Color.Black
                )
        )
        Text(
            text = "Eric Bishop",
            fontSize = 20.sp,
            color = textColor,
            modifier = modifier
                .height(30.dp)
        )
        Text(
            text = "Business Leader",
            fontSize = 20.sp,
            color = textColor,
            modifier = modifier
                .height(30.dp)
        )
    }
}

@Composable
fun Contact(modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row() {
            Icon(
                Icons.Rounded.Call,
                null
            )
//            Image(
//                painter = painterResource(id = R.drawable.call_24dp_e8eaed),
//                contentDescription = null,
//                contentScale = ContentScale.Fit,
//                modifier = modifier
//                    .height(10.dp)
//                    .background(
//                        color = Color.Black
//                    )
            Text(
                text = "-10 (30) 782 9860",
                color = Color.Black,
                modifier = modifier
            )
        }
        Row() {
            Icon(
                Icons.Rounded.Share,
                null
            )
            Text(
                text = "@somethingsomething",
                color = Color.Black,
                modifier = modifier
            )
        }
        Row() {
            Icon(
                Icons.Rounded.Email,
                null
            )
//            Image(
//                painter = painterResource(id = R.drawable.share_24dp_e8eaed),
//                contentDescription = null,
//                contentScale = ContentScale.Fit,
//                modifier = modifier
//                    .height(10.dp)
//                    .background(
//                        color = Color.Black
//                    )
//            )
            Text(
                text = "email@somethingwhere",
                color = Color.Black,
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardsPreview() {
    Business_CardTheme {
        Card(name = "Android")
    }
}
