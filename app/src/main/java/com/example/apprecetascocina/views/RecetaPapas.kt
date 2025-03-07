package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun RecetaPapas(navController: NavController) {
    DetailView(
        "\uD83C\uDF5F Papas Fritas",
        "Deliciosas y crujientes papas cortadas en tiras y fritas en aceite, un acompañamiento popular en muchas comidas.\n\n" +
        "Ingredientes:\n" +
                "    - \uD83E\uDD54 3 papas grandes\n" +
                "    - \uD83E\uDED2 Aceite para freír\n" +
                "    - \uD83E\uDDC2 Sal al gusto\n\n" +
                "Preparación:\n" +
                "    1. Pela y corta las papas en tiras delgadas o gruesas según tu preferencia.\n" +
                "    2. Enjuágalas con agua fría para eliminar el exceso de almidón y sécalas bien.\n" +
                "    3. Calienta suficiente aceite en una sartén o freidora a 180°C.\n" +
                "    4. Fríe las papas en tandas hasta que estén doradas y crujientes.\n" +
                "    5. Retira el exceso de aceite con papel absorbente y agrégales sal.\n" +
                "    6. Disfrútalas solas o con tu salsa favorita.",
        R.drawable.papas,
        navController
    )
}