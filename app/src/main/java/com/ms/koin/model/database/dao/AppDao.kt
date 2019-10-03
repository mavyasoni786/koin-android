package com.ms.koin.model.database.dao

import androidx.room.*
import com.ms.koin.model.database.entity.Apps
import com.ms.koin.utils.DBConstant


@Dao
interface AppDao {
    @Query("SELECT * FROM " + DBConstant.mAppTable)
    suspend fun getAll(): List<Apps>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(userList: List<Apps>)

    @Query("DELETE FROM " + DBConstant.mAppTable)
    suspend fun deleteAll()

    @Transaction
    suspend fun insertAllApps(userList: List<Apps>) {
        insert(userList)
    }
}
