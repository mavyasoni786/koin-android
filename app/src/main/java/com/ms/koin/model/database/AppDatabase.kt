package com.ms.koin.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
 import com.ms.koin.model.database.dao.AppDao
import com.ms.koin.model.database.entity.Apps
import com.ms.koin.utils.DBConstant


@Database(entities = [Apps::class], version = DBConstant.mVersion)
abstract class AppDatabase : RoomDatabase() {
    //dao goes here
    abstract fun appDao(): AppDao
}
