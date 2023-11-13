package com.stellarbitsapps.pdv.util

class Utils {
    companion object {
        fun convertMoneyToFloat(value: String): Float {
            return value
                .replace("R$", "")
                .replace(".", "")
                .replace(",", ".")
                .trim()
                .toFloat()
        }
    }
}