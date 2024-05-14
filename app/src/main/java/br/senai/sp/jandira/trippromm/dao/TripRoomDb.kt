package br.senai.sp.jandira.trippromm.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.trippromm.model.Viagem

@Database(entities = [Viagem::class], version = 1)
abstract class TripRoomDb : RoomDatabase() {


    abstract fun TripRoomDao(): TripRoomDao

    companion object{
        private lateinit var instancia: TripRoomDb

        fun getBancoDeDados(context: Context): TripRoomDb {
            instancia = Room
                .databaseBuilder(
                    context,
                    TripRoomDb::class.java,
                    "db_contatos"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}