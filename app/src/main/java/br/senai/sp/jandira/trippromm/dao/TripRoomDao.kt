package br.senai.sp.jandira.trippromm.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Query
import br.senai.sp.jandira.trippromm.model.Usuario
import br.senai.sp.jandira.trippromm.model.Viagem

@Dao
interface TripRoomDao {

    @Insert
    fun salvar(viagem: Viagem): Long

    @Update
    fun atualizar(viagem: Viagem): Int

    @Delete
    fun deletar(viagem: Viagem)

    @Query("SELECT * FROM tbl_usuarios ORDER BY nome ASC")
    fun listarTodosOsContatos():List<Viagem>

    @Query("SELECT * FROM tbl_usuarios WHERE nome = :nome ORDER BY NOME ASC")
    fun buscarContatoPeloNome(nome: String): List<Viagem>


    @Query("SELECT  * FROM tbl_usuarios WHERE id = :id")
    fun buscarContatoPeloId(id: Long): Viagem



}


