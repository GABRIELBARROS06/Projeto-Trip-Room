package br.senai.sp.jandira.trippromm.repository


import br.senai.sp.jandira.trippromm.dao.TripRoomDb
import br.senai.sp.jandira.trippromm.model.Usuario
import android.content.Context
import br.senai.sp.jandira.trippromm.model.Viagem

class UsuarioRepository(context: Context) {
    private val db = TripRoomDb.getBancoDeDados(context).TripRoomDao()
    
    fun salvar(viagem: Viagem):Long{
        return  db.salvar(viagem)
    }
    
    fun listarTodosOsContatos(): List<Viagem>{
        return db.listarTodosOsContatos()
    }

}