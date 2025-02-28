package com.example.apprecetascocina.views

import com.example.apprecetascocina.R
import androidx.compose.runtime.Composable

@Composable
fun RecetaPizza() {
    DetailView(
        "\uD83C\uDF55 Pizza Casera",
        "Ingredientes:\n" +
                "Ingredientes:\n" +
                "    - 250 g de harina\n" +
                "    - 1 cucharadita de levadura seca\n" +
                "    - 150 ml de agua tibia\n" +
                "    - 1 cucharada de aceite de oliva\n" +
                "    - 1/2 cucharadita de sal\n" +
                "    - 100 g de salsa de tomate\n" +
                "    - 150 g de queso mozzarella\n" +
                "    - Ingredientes opcionales: pepperoni, champiñones, pimientos, etc.\n" +
                "Preparación:\n" +
                "    - Mezcla la harina, la levadura, la sal y el agua hasta formar una masa suave. Deja reposar 30 minutos.\n" +
                "    - Extiende la masa sobre una superficie enharinada y dale forma de disco.\n" +
                "    - Unta la salsa de tomate y agrega el queso y los ingredientes de tu elección.\n" +
                "    - Hornea a 200°C por 15-20 minutos hasta que la masa esté dorada y el queso derretido.\n" +
                "    - Sírvela caliente y disfruta.",
        R.drawable.pizza,
    )
}