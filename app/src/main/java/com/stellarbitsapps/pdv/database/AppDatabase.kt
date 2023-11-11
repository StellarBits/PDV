package com.stellarbitsapps.pdv.database

import android.content.Context
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(
//    version = 1,
//    entities = [],
//    autoMigrations = [],
//    exportSchema = true
//)
//abstract class AppDatabase: RoomDatabase() {
//    companion object {
//        @Volatile
//        private var INSTANCE: AppDatabase? = null
//
//        fun getDatabase(context: Context): AppDatabase {
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context,
//                    AppDatabase::class.java, "pdv.db")
//                    .build()
//                INSTANCE = instance
//
//                instance
//            }
//        }
//    }
//}