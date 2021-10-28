@file:Suppress("DEPRECATED_ANNOTATION")

package com.example.recyleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class superhero(
    val imgsuperhero: Int,
    val namesuperhero: String,
    val descsuperhero: String
) : Parcelable
