package com.example.usecase.domain

import com.example.usecase.data.remote.dto.CharactersItem
import com.example.usecase.domain.model.Characters

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
interface CharacterRepository {
    suspend fun getCharacters() : List<CharactersItem>

    suspend fun getCharactersByName(name : String) : CharactersItem
}