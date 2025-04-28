package com.fake.poetest

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var username: String,
    var password: String
)
