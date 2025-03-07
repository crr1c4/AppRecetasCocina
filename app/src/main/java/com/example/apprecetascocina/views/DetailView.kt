package com.example.apprecetascocina.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.apprecetascocina.R
import com.example.apprecetascocina.components.MainIconButton
import com.example.apprecetascocina.components.TitleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(title: String, description: String, imageId: Int, navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(title) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.hsl(0f,0f, 0f, 0.5f)),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        },
    ) { ContentView(title, description, imageId) }
}

@Composable
private fun ContentView(title: String, description: String, imageId: Int) {
    val scroll = rememberScrollState()
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp

    Column(modifier = Modifier
        .fillMaxSize()
//        .background(Color.White)
        .verticalScroll(scroll)
        .paint(
            painter = painterResource(id = R.drawable.fondo_aplicacion),
            contentScale = ContentScale.Crop
        ).background(Color.White.copy(alpha = 0.9f))
        ,
        // verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = imageId),
            contentDescription = title,
            modifier = Modifier.fillMaxWidth().height(screenHeight * 0.3f),
            contentScale = ContentScale.Crop // Ajusta la imagen sin deformarla
        )

        Text(description,
            color = Color.Black,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(20.dp)
        )
    }
}