package com.example.apprecetascocina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.apprecetascocina.ui.theme.AppRecetasCocinaTheme
import com.example.apprecetascocina.views.DetailView
import com.example.apprecetascocina.views.HomeView
import com.example.apprecetascocina.views.RecetaHuevo
import com.example.apprecetascocina.views.RecetaPapas
import com.example.apprecetascocina.views.RecetaPizza
import com.example.apprecetascocina.views.RecetaSandwich

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppRecetasCocinaTheme {
                HomeView()
                // RecetaSandwich()
            }
        }
    }
}