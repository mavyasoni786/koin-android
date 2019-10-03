package com.ms.koin.injections

import androidx.room.Room
import com.ms.koin.model.database.AppDatabase
import com.ms.koin.utils.DBConstant
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    // Dependency: AppDatabase
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, DBConstant.mName).build()
    }

    //Provide all dao dependency here

    // App Dao Dependency:
    single {
        val appDatabase: AppDatabase = get()
        appDatabase.appDao()
    }
}
