package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun RecetaPizza(navController: NavController) {
    DetailView(
        "\uD83C\uDF55 Pizza Casera",
        "Una base de masa horneada cubierta con salsa de tomate, queso derretido y una variedad de ingredientes como pepperoni, champiñones o vegetales.\n\n"+
                "Ingredientes:\n" +
                "    - \uD83C\uDF3E 250 g de harina\n" +
                "    - \uD83C\uDF5E 1 cucharadita de levadura seca\n" +
                "    - \uD83D\uDCA7 150 ml de agua tibia\n" +
                "    - \uD83E\uDED2 1 cucharada de aceite de oliva\n" +
                "    - \uD83E\uDDC2 1/2 cucharadita de sal\n" +
                "    - \uD83C\uDF45 100 g de salsa de tomate\n" +
                "    - \uD83E\uDDC0 150 g de queso mozzarella\n" +
                "    - \uD83C\uDF55 Ingredientes opcionales: pepperoni, champiñones, pimientos, etc.\n\n" +
                "Preparación:\n" +
                "    1. Mezcla la harina, la levadura, la sal y el agua hasta formar una masa suave. Deja reposar 30 minutos.\n" +
                "    2. Extiende la masa sobre una superficie enharinada y dale forma de disco.\n" +
                "    3. Unta la salsa de tomate y agrega el queso y los ingredientes de tu elección.\n" +
                "    4. Hornea a 200°C por 15-20 minutos hasta que la masa esté dorada y el queso derretido.\n" +
                "    5. Sírvela caliente y disfruta.",
        R.drawable.pizza,
        navController
    )
}