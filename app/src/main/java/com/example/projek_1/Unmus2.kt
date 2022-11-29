package com.example.projek_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projek_1.R.*
import com.example.projek_1.ui.theme.Projek_1Theme

@Composable
fun Project2() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            painter = painterResource(id = R.drawable.sampulutama
            ),
            contentDescription = "Diary",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(
                    vertical = 20.dp
                ),
            text = "Selamat Datang!",
            style = TextStyle(
                fontSize = 35.sp
            ),
        )
        Text(
            text = "Di Aplikasi Buku",
            style = TextStyle(
                fontSize = 25.sp
            )
        )
        Spacer(
            modifier = Modifier
                .height(70.dp)
        )
        Button(onClick = {
            println("Clicked")
        }) {
            Text(text = "Mulai Baca")
        }
    }
}

@Preview
@Composable
fun PreviewProject2() {
    Project2()
}
