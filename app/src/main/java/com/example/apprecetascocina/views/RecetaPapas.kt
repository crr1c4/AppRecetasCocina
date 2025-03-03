package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun RecetaPapas(navController: NavController) {
    DetailView(
        "\uD83C\uDF5F Papas Fritas",
        "Ingredientes:\n" +
                "    - 3 papas grandes\n" +
                "    - Aceite para freír\n" +
                "    - Sal al gusto\n" +
                "Preparación:\n" +
                "    - Pela y corta las papas en tiras delgadas o gruesas según tu preferencia.\n" +
                "    - Enjuágalas con agua fría para eliminar el exceso de almidón y sécalas bien.\n" +
                "    - Calienta suficiente aceite en una sartén o freidora a 180°C.\n" +
                "    - Fríe las papas en tandas hasta que estén doradas y crujientes.\n" +
                "    - Retira el exceso de aceite con papel absorbente y agrégales sal.\n" +
                "    - Disfrútalas solas o con tu salsa favorita.",
        R.drawable.papas,
        navController
    )
}