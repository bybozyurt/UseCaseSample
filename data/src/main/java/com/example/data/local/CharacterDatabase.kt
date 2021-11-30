package com.example.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.domain.model.Characters
import com.example.data.remote.dto.CharactersItem

/**
 * Created by Ahmet Bozyurt on 30.11.2021
 */

@Database(entities = arrayOf(Characters::class),version = 1)
abstract class CharacterDatabase : RoomDatabase() {

    abstract fun characterDao() : CharactersDao
}