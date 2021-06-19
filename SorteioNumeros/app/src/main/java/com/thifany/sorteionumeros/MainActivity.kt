package com.thifany.sorteionumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var resultadoSorteio: TextView
    lateinit var botaoSortear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultadoSorteio = findViewById(R.id.textResultado)
        botaoSortear = findViewById(R.id.buttonSortear)

        botaoSortear.setOnClickListener {
            SortearNumero()
        }
    }

    fun SortearNumero() {
        var numeroSorteado = Random().nextInt(11)

        resultadoSorteio.text = "O número é: $numeroSorteado"
    }
}
