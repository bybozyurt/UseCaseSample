package com.example.usecase.data.repository

import com.example.usecase.data.remote.CharactersApi
import com.example.usecase.data.remote.dto.CharactersItem
import com.example.usecase.domain.CharacterRepository
import javax.inject.Inject

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
class CharacterRepositoryImpl @Inject constructor(private val charactersApi: CharactersApi) : CharacterRepository {

    override suspend fun getCharacters(): List<CharactersItem> {
        return charactersApi.getCharacters()
    }

    override suspend fun getCharactersByName(name: String): CharactersItem {
        return charactersApi.getCharactersByName(name)
    }
}