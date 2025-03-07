package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun RecetaHuevo(navController: NavController) {
    DetailView(
        "\uD83C\uDF73 Huevo con Jamón",
        "Un desayuno clásico y nutritivo que combina huevos revueltos o fritos con trozos de jamón, ideal para comenzar el día con energía.\n\n"+
        "Ingredientes:\n" +
                "    - \uD83E\uDD5A 2 huevos\n" +
                "    - \uD83E\uDD53 2 rebanadas de jamón\n" +
                "    - \uD83E\uDDC8 1 cucharada de aceite o mantequilla\n" +
                "    - \uD83E\uDDC2 Sal y pimienta al gusto\n" +
                "\n" +
                "Preparación:\n" +
                "    1. Corta el jamón en trozos pequeños.\n" +
                "    2. En una sartén con aceite o mantequilla caliente, sofríe el jamón hasta que se dore ligeramente.\n" +
                "    3. Bate los huevos en un recipiente y agrégales sal y pimienta.\n" +
                "    4. Vierte los huevos en la sartén y revuelve hasta que estén cocidos.\n" +
                "    5. Sirve caliente con pan o tortillas.",
        R.drawable.huevito,
        navController
    )
}