package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                var count by remember {
                    mutableStateOf(0)
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = count.toString(), fontSize = 30.sp)
                    Button(onClick = {
                        count++
                    }) {
                        Text(text = "Click me:$count")
                    }

                }
            }
        }
    }
}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
////    Row(
//// horizontalArrangement = Arrangement.End,
////        modifier=Modifier.fillMaxSize()
////    ) {
////
////        Text(
////            text = "Hello $name!",
////            color = Color.Blue,
////            fontSize = 30.sp,
////        )
////        Text(
////            text = "Some other text",
////            color = Color.Blue,
////            fontSize = 30.sp,
////        )
////    }
//
////Image(
////    painter = painterResource(id = R.drawable.ic_launcher_foreground),
////    contentDescription =null ,
////    modifier=Modifier.background(Color.Black))
////   LazyRow(modifier = Modifier.fillMaxSize()) {
////     items (10){i->
////            Icon(
////                imageVector = Icons.Default.Add,
////                contentDescription = null,
////                modifier=Modifier.size(100.dp)
////            )
////        }
////    }
//
//}

