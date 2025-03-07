package com.example.apprecetascocina.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.apprecetascocina.R
import com.example.apprecetascocina.components.ActionButton
import com.example.apprecetascocina.components.Card
import com.example.apprecetascocina.components.Spacers
import com.example.apprecetascocina.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "App Recetas Cocina", color = Color.White) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Blue)
            )
        },
    ) {
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Card(
            "Huevo con Jamón",
            "Un desayuno clásico y nutritivo que combina huevos revueltos o fritos con trozos de jamón, ideal para comenzar el día con energía.",
            R.drawable.huevito,
            Color.Blue,
            "Ver Receta") {
            navController.navigate("Huevo")
        }
        Spacers()
        Card("Papas fritas",
            "Deliciosas y crujientes papas cortadas en tiras y fritas en aceite, un acompañamiento popular en muchas comidas.",
            R.drawable.papas,
            Color.Blue,
           "Ver Receta") {
            navController.navigate("Papas")

        }
        Spacers()
        Card(
            "Pizza",
            "Una base de masa horneada cubierta con salsa de tomate, queso derretido y una variedad de ingredientes como pepperoni, champiñones o vegetales.",
            R.drawable.pizza,
            Color.Blue,
            "Ver Receta") {

            navController.navigate("Pizza")
        }
        Spacers()
        Card(
            "Sandiwch",
            "Una combinación versátil de pan relleno con ingredientes como jamón, queso, vegetales y salsas, perfecto para una comida rápida y deliciosa.",
            R.drawable.sandwich,
            Color.Blue,
            "Ver Receta") {
            navController.navigate("Sandwich")
        }
        Spacers()
    }
}