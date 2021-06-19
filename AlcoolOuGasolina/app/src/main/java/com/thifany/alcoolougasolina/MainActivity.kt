package com.thifany.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonCalcular: Button
    lateinit var textResultado: TextView
    var valorAlcool: Float? = null
    var valorGasolina: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular = findViewById(R.id.buttonCalcular)
        textResultado = findViewById(R.id.textResultado)

        buttonCalcular.setOnClickListener {
            valorAlcool = findViewById<EditText>(R.id.editValorAlcool).text.toString().toFloatOrNull()
            valorGasolina = findViewById<EditText>(R.id.editValorGasolina).text.toString().toFloatOrNull()
            Calcular()
        }
    }

    fun Calcular() {
        var resultado: Float

        resultado = valorAlcool!!.div(valorGasolina!!)

        if (resultado < 0.7) {
            textResultado.setText("Álcool é a melhor opção!")
        } else {
            textResultado.setText("Gasolina é a melhor opção!")
        }
    }
}