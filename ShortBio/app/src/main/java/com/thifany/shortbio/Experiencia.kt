package com.thifany.shortbio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Experiencia : AppCompatActivity() {

    private lateinit var buttonVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.experiencia)

        buttonVoltar = findViewById(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            val intent = Intent(this@Experiencia, MainActivity::class.java)
            startActivity(intent)
        }
    }
}