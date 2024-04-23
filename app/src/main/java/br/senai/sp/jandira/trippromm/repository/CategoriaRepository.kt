package br.senai.sp.jandira.trippromm.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.trippromm.model.Categoria

class CategoriaRepository {

    @Composable
    fun listarTodasasCategorias(): List<Categoria> {
        // Viagem Londres = new Viagem();
        val montain = Categoria()
        montain.id = 1
        Icon(imageVector = Icons.Default.Landscape, contentDescription = "")

        montain.title = "Montain"

        val snow = Categoria()
        snow.id = 2
            Icon(imageVector = Icons.Default.Snowboarding, contentDescription = "")

        snow.title = "Snow"

        val beach = Categoria()
        beach.id = 3
            Icon(imageVector = Icons.Default.BeachAccess, contentDescription = "")

        beach.title = "Beach"

        return listOf(montain, snow, beach)
    }



}