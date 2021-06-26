package com.thifany.listagemusuarios

import android.graphics.drawable.Drawable

data class Usuario(
    var foto: Drawable?=null,
    var nome: String,
    var email: String,
)
