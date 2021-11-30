package com.example.data.local

import androidx.room.*
import com.example.data.domain.model.Characters
import com.example.data.remote.dto.CharactersItem

/**
 * Created by Ahmet Bozyurt on 30.11.2021
 */
@Dao
interface CharactersDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(vararg characters : Characters) : List<Long>

    @Query("SELECT * FROM characters")
    suspend fun getAllCharacters() : List<Characters>

    @Query("DELETE FROM characters")
    suspend fun deleteAllCharacters()

    @Update
    suspend fun updateCharacter(character : Characters)

    @Query("SELECT * FROM characters WHERE flag = 1")
    suspend fun getFavoriteCharacters() : List<Characters>


}