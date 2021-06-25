package com.thifany.shortbio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Objetivo : AppCompatActivity() {

    private lateinit var buttonVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.objetivo)

        buttonVoltar = findViewById(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            val intent = Intent(this@Objetivo, MainActivity::class.java)
            startActivity(intent)
        }
    }
}