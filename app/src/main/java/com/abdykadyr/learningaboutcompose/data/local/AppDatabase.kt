package com.abdykadyr.learningaboutcompose.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RollDbModel::class], version = 1)

abstract class AppDatabase : RoomDatabase() {

    abstract fun rollsDao() : RollsDao

    companion object {
        private var db: AppDatabase? = null
        private const val DB_NAME = "main.db"
        private val LOCK = Any()

        fun getInstance(context: Context): AppDatabase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance = Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                    .build()
                db = instance
                return instance
            }
        }
    }

}