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
                    0,
                    "Fraldinha",
                    1,
                    35.90f,
                    28.90f,
                    5f,
                    50f,
                    1f
                ),
                Product(
                    1,
                    "Picanha",
                    1,
                    49.90f,
                    34.90f,
                    5f,
                    70f,
                    1f
                ),
                Product(
                    2,
                    "Filé de costela",
                    1,
                    37.90f,
                    29.90f,
                    5f,
                    30f,
                    1f
                ),
                Product(
                    3,
                    "Filé mignon",
                    1,
                    49.90f,
                    34.90f,
                    5f,
                    70f,
                    1f
                ),
                Product(
                    4,
                    "Peito de frango",
                    1,
                    29.90f,
                    21.90f,
                    5f,
                    70f,
                    1f
                )
            ),
            mutableListOf(
                Product(
                    0,
                    "Quindim",
                    2,
                    2.90f,
                    1.90f,
                    20f,
                    400f,
                    1f
                ),
                Product(
                    1,
                    "Bomba de chocolate",
                    2,
                    3.90f,
                    2.90f,
                    20f,
                    300f,
                    1f
                ),
                Product(
                    2,
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