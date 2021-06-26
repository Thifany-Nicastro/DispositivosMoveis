package com.thifany.tarefas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvTarefas)

        val lista = mutableListOf<Tarefa>(
            Tarefa(titulo="Foo", descricao="Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
            Tarefa(titulo="Bar", descricao="Integer sit amet ligula lacinia, condimentum justo nec, lacinia mauris."),
            Tarefa(titulo="Test", descricao="Morbi sollicitudin libero sed metus interdum lacinia. In non convallis neque.")
        )

        rv.adapter = TarefaAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}