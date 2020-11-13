package com.example.digitalhousechallenge2.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    var imageRestaurant: String,
    var nomeRestaurant: String,
    var locationRestaurant: String,
    var closeAt: String,
    var cardapio: MutableList<Pratos>
) : Parcelable
