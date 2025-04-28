package com.fake.poetest

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CategoryDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(categoryEntity: CategoryEntity): Long

    @Query("SELECT * FROM category")
    fun getAllCategories(): List<CategoryEntity>

    @Query("DELETE FROM category")
    fun deleteAllCategories()
}