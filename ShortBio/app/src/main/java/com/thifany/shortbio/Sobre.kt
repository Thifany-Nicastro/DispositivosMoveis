package com.thifany.shortbio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sobre : AppCompatActivity() {

    private lateinit var buttonVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sobre)

        buttonVoltar = findViewById(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            val intent = Intent(this@Sobre, MainActivity::class.java)
            startActivity(intent)
        }
    }
}