package com.example.album

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.album.ui.theme.AlbumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlbumTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Layout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Layout(modifier: Modifier = Modifier) {
    var count by remember { mutableIntStateOf(1) }

    val imageRes = when (count) {
        1 -> painterResource(R.drawable.img_1)
        2 -> painterResource(R.drawable.img_2)
        3 -> painterResource(R.drawable.img_3)
        4 -> painterResource(R.drawable.img_4)
        5 -> painterResource(R.drawable.img_5)
        else -> painterResource(R.drawable.ic_launcher_foreground)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Photo Vault",
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            color = Color.Red
        )
        Spacer(modifier = Modifier.size(20.dp))

        Box(
            modifier = Modifier
                .border(2.dp, Color.Black)



        ) {
            Image(
                painter = imageRes,
                contentDescription = null
            )

        }
        Spacer(modifier = Modifier.size(30.dp))
        Row {

            Button(
                onClick = {
                    if (count > 1){
                        count--
                    }
                },
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Previous")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Button(
                onClick = {
                    if (count < 5) {
                        count++
                    }
                },
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Next")
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun AlbumPreview() {
    AlbumTheme {
        Layout()
    }
}
