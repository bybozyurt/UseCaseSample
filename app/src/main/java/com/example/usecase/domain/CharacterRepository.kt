package com.example.usecase.domain

import com.example.usecase.data.remote.dto.CharactersItem

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
interface CharacterRepository {
    suspend fun getCharacters() : List<CharactersItem>
}