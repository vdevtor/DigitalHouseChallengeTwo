package com.example.digitalhousechallenge2.Models

import android.os.Parcelable
import android.widget.ImageView
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pratos(
        //var imgGrandePrato: String,
        var imagePrato : String,
        var pratoDescricao : String,
        var pratoDescricaoCompleta : String

): Parcelable
