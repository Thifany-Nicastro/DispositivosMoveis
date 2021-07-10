package com.thifany.listatarefasretrofit

import com.thifany.listatarefasretrofit.data.model.Tarefa

interface TarefaAdapterListener {
    fun excluirTarefa(tarefa: Tarefa)
}
