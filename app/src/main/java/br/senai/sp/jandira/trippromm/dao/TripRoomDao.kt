package br.senai.sp.jandira.trippromm.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import br.senai.sp.jandira.trippromm.model.Viagem
import androidx.room.Query
interface TripRoomDao {

    @Insert
    fun salvar(contato: Contato): Long

    @Update
    fun atualizar(contato: Contato): Int

    @Delete
    fun deletar(contato: Contato)

    @Query("SELECT * FROM tbl_contatos ORDER BY nome ASC")
    fun listarTodosOsCont():List<Contato>

    @Query("SELECT * FROM tbl_contatos WHERE nome = :nome ORDER BY NOME ASC")
    fun buscarContatoPeloNome(nome: String): List<Contato>


    @Query("SELECT  * FROM tbl_contatos WHERE id = :id")
    fun buscarContatoPeloId(id: Long): Contato



}