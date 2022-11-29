package com.example.projek_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projek_1.R.*
import com.example.projek_1.ui.theme.Projek_1Theme

@Composable
fun GridItem() {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Image(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(id = R.drawable.masakan),
            contentDescription = "True Beauty",
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Buku Masakan",
            style = TextStyle(
                fontSize = 20.sp
            )
        )
    }
}



@Preview
@Composable
fun PreviewGridItem() {
    GridItem()
}

@Composable
fun Project4() {
    Column(
        modifier = Modifier.background(Color.Gray)
    ) {
        Text(
            text = "Welcome to aplikasi buku !".uppercase(),
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Daftar Buku Masakan",
            fontSize = 25.sp,
            modifier = Modifier.padding(16.dp)
        )
        Row {
            GridItem()
            GridItem()
        }
        Row {
            GridItem()
            GridItem()
        }
    }
}

@Preview
@Composable
fun PreviewProject4() {
    Project4()
}
