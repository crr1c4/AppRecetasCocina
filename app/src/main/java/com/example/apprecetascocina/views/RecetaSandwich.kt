package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun RecetaSandwich(navController: NavController) {
    DetailView(
        "\uD83E\uDD6A Sándwich Clásico",
        "Ingredientes:\n" +
                "    - 2 rebanadas de pan\n" +
                "    - 2 rebanadas de jamón\n" +
                "    - 2 rebanadas de queso\n" +
                "    - 2 hojas de lechuga\n" +
                "    - 2 rodajas de tomate\n" +
                "    - Mayonesa y mostaza al gusto\n" +
                "Preparación:\n" +
                "    - Unta mayonesa y mostaza en una de las rebanadas de pan.\n" +
                "    - Coloca el jamón, el queso, la lechuga y el tomate.\n" +
                "    - Cubre con la otra rebanada de pan.\n" +
                "    - Si lo prefieres caliente, puedes tostarlo en una sartén o sandwichera.\n" +
                "    - Corta por la mitad y sirve.",
        R.drawable.sandwich,
        navController
    )
}