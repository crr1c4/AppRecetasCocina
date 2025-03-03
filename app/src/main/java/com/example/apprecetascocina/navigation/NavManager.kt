package com.example.apprecetascocina.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.apprecetascocina.views.HomeView
import com.example.apprecetascocina.views.RecetaHuevo
import com.example.apprecetascocina.views.RecetaPapas
import com.example.apprecetascocina.views.RecetaPizza
import com.example.apprecetascocina.views.RecetaSandwich

@Composable
fun NavManager() {
  val navController = rememberNavController()
  NavHost(navController = navController, startDestination = "Home") {
      composable("Home") {
        HomeView(navController)
      }
      composable("Sandwich") {
        RecetaSandwich(navController)
      }
      composable("Huevo") {
        RecetaHuevo(navController)
      }
      composable("Papas") {
        RecetaPapas(navController)
      }
      composable("Pizza") {
        RecetaPizza(navController)
      }

  }
}