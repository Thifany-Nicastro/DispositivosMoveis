package com.thifany.shortbio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSobre: Button
    private lateinit var buttonFormacao: Button
    private lateinit var buttonExperiencia: Button
    private lateinit var buttonObjetivo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSobre = findViewById(R.id.buttonSobre)
        buttonFormacao = findViewById(R.id.buttonFormacao)
        buttonExperiencia = findViewById(R.id.buttonExperiencia)
        buttonObjetivo = findViewById(R.id.buttonObjetivo)

        buttonSobre.setOnClickListener {
            val intent = Intent(this@MainActivity, Sobre::class.java)
            startActivity(intent)
        }
        buttonFormacao.setOnClickListener {
            val intent = Intent(this@MainActivity, Formacao::class.java)
            startActivity(intent)
        }
        buttonExperiencia.setOnClickListener {
            val intent = Intent(this@MainActivity, Experiencia::class.java)
            startActivity(intent)
        }
        buttonObjetivo.setOnClickListener {
            val intent = Intent(this@MainActivity, Objetivo::class.java)
            startActivity(intent)
        }
    }
}