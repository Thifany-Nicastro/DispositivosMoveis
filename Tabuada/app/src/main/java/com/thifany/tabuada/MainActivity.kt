package com.thifany.tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(view: View){
        var resultado = findViewById(R.id.textResultado) as TextView
        var numero= Integer.parseInt(findViewById<EditText>(R.id.textNumero).text.toString())
        var calculo = 0
        var tabuada = ""

        for(i in 1..10){
            calculo = i * numero
            tabuada += "$i * $numero = $calculo \n"
        }

        resultado.setText(tabuada)
    }
}