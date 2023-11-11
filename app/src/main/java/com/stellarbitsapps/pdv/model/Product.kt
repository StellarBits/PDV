package com.stellarbitsapps.pdv.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "nome") val name: String,
    @ColumnInfo(name = "idgrupo") val groupId: Int,
    @ColumnInfo(name = "preco") val price: Float,
    @ColumnInfo(name = "preco_atacado") val wholesalePrice: Float,
    @ColumnInfo(name = "qtde_atacado") val wholesaleQuantity: Float,
    @ColumnInfo(name = "estoque") val stock: Float,
    @ColumnInfo(name = "unidade") val unit: Float
) : Parcelable