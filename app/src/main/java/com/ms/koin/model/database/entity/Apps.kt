package com.ms.koin.model.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ms.koin.utils.DBConstant


@Entity(tableName = DBConstant.mAppTable)
data class Apps(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val thumb: String,
    val firstName: String,
    val description: String
)
