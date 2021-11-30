package com.example.data.domain

import com.example.data.remote.dto.CharactersItem

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
interface CharacterRepository {
    suspend fun getCharacters() : List<CharactersItem>

    suspend fun getCharactersById(id : Int) : CharactersItem
}