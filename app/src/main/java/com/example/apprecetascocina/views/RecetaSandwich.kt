package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun RecetaSandwich(navController: NavController) {
    DetailView(
        "\uD83E\uDD6A Sándwich Clásico",
        "Una combinación versátil de pan relleno con ingredientes como jamón, queso, vegetales y salsas, perfecto para una comida rápida y deliciosa.\n\n"+
        "Ingredientes:\n" +
                "    - \uD83C\uDF5E 2 rebanadas de pan\n" +
                "    - \uD83E\uDD53 2 rebanadas de jamón\n" +
                "    - \uD83E\uDDC0 2 rebanadas de queso\n" +
                "    - \uD83E\uDD6C 2 hojas de lechuga\n" +
                "    - \uD83C\uDF45 2 rodajas de tomate\n" +
                "    - \uD83C\uDF2D Mayonesa y mostaza al gusto\n\n" +
                "Preparación:\n" +
                "    1. Unta mayonesa y mostaza en una de las rebanadas de pan.\n" +
                "    2. Coloca el jamón, el queso, la lechuga y el tomate.\n" +
                "    3. Cubre con la otra rebanada de pan.\n" +
                "    4. Si lo prefieres caliente, puedes tostarlo en una sartén o sandwichera.\n" +
                "    5. Corta por la mitad y sirve.",
        R.drawable.sandwich,
        navController
    )
}