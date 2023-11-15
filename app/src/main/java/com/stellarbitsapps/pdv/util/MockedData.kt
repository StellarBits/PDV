package com.stellarbitsapps.pdv.util

import com.stellarbitsapps.pdv.model.Group
import com.stellarbitsapps.pdv.model.Product

// TODO Temp class. Remove later!
class MockedData {
    companion object {
        val groups = mutableListOf(
            Group(
                0,
                "Bebidas",
                "Impressora 1",
                android.R.color.holo_green_dark
            ),
            Group(
                1,
                "Carnes",
                "Impressora 2",
                android.R.color.holo_red_dark
            ),
            Group(
                2,
                "Doces",
                "Impressora 3",
                android.R.color.holo_blue_dark
            )
        )

        val products = mutableListOf(
            mutableListOf(
                Product(
                    0,
                    "Coca-cola",
                    0,
                    5.00f,
                    4.00f,
                    10f,
                    500f,
                    12f
                ),
                Product(
                    1,
                    "Fanta",
                    0,
                    5.00f,
                    4.00f,
                    10f,
                    300f,
                    12f
                ),
                Product(
                    2,
                    "Pepsi",
                    0,
                    5.00f,
                    4.00f,
                    10f,
                    200f,
                    12f
                ),
                Product(
                    3,
                    "Heineken",
                    0,
                    6.90f,
                    5.00f,
                    20f,
                    1000f,
                    12f
                )
            ),
            mutableListOf(
                Product(
                    4,
                    "Fraldinha",
                    1,
                    35.90f,
                    28.90f,
                    5f,
                    50f,
                    1f
                ),
                Product(
                    5,
                    "Picanha",
                    1,
                    49.90f,
                    34.90f,
                    5f,
                    70f,
                    1f
                ),
                Product(
                    6,
                    "Filé de costela",
                    1,
                    37.90f,
                    29.90f,
                    5f,
                    30f,
                    1f
                ),
                Product(
                    7,
                    "Filé mignon",
                    1,
                    49.90f,
                    34.90f,
                    5f,
                    70f,
                    1f
                ),
                Product(
                    8,
                    "Peito de frango",
                    1,
                    29.90f,
                    21.90f,
                    5f,
                    70f,
                    1f
                ),
                Product(
                    9,
                    "Paleta bovina",
                    1,
                    29.90f,
                    21.90f,
                    5f,
                    70f,
                    1f
                ),
                Product(
                    10,
                    "Panceta",
                    1,
                    17.90f,
                    15.90f,
                    5f,
                    100f,
                    1f
                ),
                Product(
                    11,
                    "Linguiça toscana Sadia",
                    1,
                    21.90f,
                    16.90f,
                    5f,
                    100f,
                    1f
                ),
                Product(
                    12,
                    "Linguiça toscana Seara",
                    1,
                    23.90f,
                    19.90f,
                    5f,
                    100f,
                    1f
                )
                ,
                Product(
                    13,
                    "Linguiça toscana Perdigão",
                    1,
                    25.90f,
                    11.90f,
                    5f,
                    100f,
                    1f
                )
            ),
            mutableListOf(
                Product(
                    14,
                    "Quindim",
                    2,
                    2.90f,
                    1.90f,
                    20f,
                    400f,
                    1f
                ),
                Product(
                    15,
                    "Bomba de chocolate",
                    2,
                    3.90f,
                    2.90f,
                    20f,
                    300f,
                    1f
                ),
                Product(
                    16,
                    "Pudim de leite condensado",
                    2,
                    15.90f,
                    10.90f,
                    10f,
                    120f,
                    1f
                )
            )
        )
    }
}