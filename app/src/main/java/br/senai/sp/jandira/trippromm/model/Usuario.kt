package br.senai.sp.jandira.trippromm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuarios")
    data class Usuario(

        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val nome: String = "",
        val email: String = "",
        var telefone: String = "",
        @ColumnInfo(name = "data_nascimento") val dataNascimento: String = ""
    )