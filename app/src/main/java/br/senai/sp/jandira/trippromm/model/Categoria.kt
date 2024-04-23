package br.senai.sp.jandira.trippromm.model

import android.graphics.drawable.Icon
import androidx.compose.ui.graphics.painter.Painter

class Categoria(
    var id: Int = 0,
    var imagem: Painter? = null,
    var title: String = ""
)
