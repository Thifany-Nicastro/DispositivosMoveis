package com.thifany.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.thifany.aula05.Pet

class SecondActivity : AppCompatActivity() {
    lateinit var textgrid: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textgrid = findViewById(R.id.txtGrid)

        val pet = intent.extras?.get("PET") as Pet

        listaPet.add(pet)

        textgrid.text = listaPet.toString()

        Toast.makeText(this, pet.nome, Toast.LENGTH_LONG).show()
    }

    companion object{
        val listaPet = mutableListOf<Pet>()
    }
}