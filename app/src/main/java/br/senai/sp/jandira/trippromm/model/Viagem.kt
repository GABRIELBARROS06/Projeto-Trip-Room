package br.senai.sp.jandira.trippromm.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate


class Viagem(
        var id: Int = 0,
        var descriptor: String = "",
        var destine: String = "",
        var dataChegada: LocalDate = LocalDate.now(),
        var dataPartida:LocalDate = LocalDate.now(),
        var image: Painter? = null
    )
