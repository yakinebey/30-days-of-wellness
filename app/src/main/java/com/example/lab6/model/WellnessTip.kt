package com.example.lab6.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class WellnessTip(
    val day: Int,
    @param:StringRes val titleRes: Int,
    @param:StringRes val descriptionRes: Int,
    @param:DrawableRes val imageRes: Int
)
