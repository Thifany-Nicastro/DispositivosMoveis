package com.thifany.aula05

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pet(val nome: String) : Parcelable