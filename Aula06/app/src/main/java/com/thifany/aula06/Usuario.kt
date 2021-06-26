package com.thifany.aula06

import android.graphics.drawable.Drawable

data class Usuario(
    var foto: Drawable?=null,
    var nome: String,
    var email: String,
    var stack: Stack,
    var senioridade: Senioridade
)
