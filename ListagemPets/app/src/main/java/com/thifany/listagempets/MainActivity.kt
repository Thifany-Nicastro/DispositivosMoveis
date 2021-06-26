package com.thifany.listagempets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvPets)

        val lista = mutableListOf<Pet>(
            Pet(nome="Bigodes", foto=resources.getDrawable(R.drawable.gato)),
            Pet(nome="Floquinho", foto=resources.getDrawable(R.drawable.cachorro)),
            Pet(nome="Piu", foto=resources.getDrawable(R.drawable.calopsita))
        )

        rv.adapter = PetAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)
    }
}