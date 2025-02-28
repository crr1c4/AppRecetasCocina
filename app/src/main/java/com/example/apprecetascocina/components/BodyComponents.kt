package com.example.apprecetascocina.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun TitleView(name: String) {
    Text(text = name, fontSize = 30.sp, color = Color.Black)
}

@Composable
fun Spacers() {
    Spacer(modifier = Modifier.height(10.dp))
}

@Composable
fun Button(name: String, backgroundColor: Color, color: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = color,
            containerColor = backgroundColor)) {

        Text(text = name)
    }
}

@Composable
fun Card(title: String, description: String, imageId: Int, buttonColor: Color, buttonLabel: String, onClick: () -> Unit) {
    Row (modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(imageId),
            contentDescription = "Round corner image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)
                .clip(RoundedCornerShape(10))
        )

        Column (modifier = Modifier.padding(start = 16.dp)) {
            // Titulo
            Text(text = title, color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Text(text = description, color = Color.Gray, maxLines = 2, overflow = TextOverflow.Ellipsis, modifier = Modifier.wrapContentHeight())

            Button(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = buttonColor
                )
            ) {

                Text(text = buttonLabel, )
            }
        }
    }

}