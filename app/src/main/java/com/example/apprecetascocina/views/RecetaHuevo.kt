package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable

@Composable
fun RecetaHuevo() {
    DetailView(
        "\uD83C\uDF73 Huevo con Jamón",
        "Ingredientes:\n" +
                "    - 2 huevos\n" +
                "    - 2 rebanadas de jamón\n" +
                "    - 1 cucharada de aceite o mantequilla\n" +
                "    - Sal y pimienta al gusto\n" +
                "\n" +
                "Preparación:\n" +
                "    - Corta el jamón en trozos pequeños.\n" +
                "    - En una sartén con aceite o mantequilla caliente, sofríe el jamón hasta que se dore ligeramente.\n" +
                "    - Bate los huevos en un recipiente y agrégales sal y pimienta.\n" +
                "    - Vierte los huevos en la sartén y revuelve hasta que estén cocidos.\n" +
                "    - Sirve caliente con pan o tortillas.",
        R.drawable.huevito,
    )
}