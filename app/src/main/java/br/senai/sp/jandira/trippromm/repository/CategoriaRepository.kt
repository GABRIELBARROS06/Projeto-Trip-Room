package br.senai.sp.jandira.trippromm.repository

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.trippromm.R
import br.senai.sp.jandira.trippromm.dao.TripRoomDb
import br.senai.sp.jandira.trippromm.model.Categoria
import android.content.Context

class CategoriaRepository {
    @Composable
    fun listarTodasasCategorias(): List<Categoria> {
        // Viagem Londres = new Viagem();
        val montain = Categoria()
        montain.id = 1
        montain.imagem = painterResource(id = R.drawable.landscape)
        montain.title = "Montain"

        val snow = Categoria()
        snow.id = 2
        snow.imagem = painterResource(id = R.drawable.snow)
        snow.title = "Snow"

        val beach = Categoria()
        beach.id = 3
        beach.imagem = painterResource(id = R.drawable.beach)
        beach.title = "Beach"

        return listOf(montain, snow, beach)
    }



}