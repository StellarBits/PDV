package com.stellarbitsapps.pdv.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.parcelize.Parcelize

@Parcelize
data class Group(
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "nome") val name: String,
    @ColumnInfo(name = "impressora") val printer: String,
    @ColumnInfo(name = "cor") val color: Int
) : Parcelable