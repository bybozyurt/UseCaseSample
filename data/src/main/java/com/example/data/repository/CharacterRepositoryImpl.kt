package com.example.data.repository

import com.example.data.remote.CharactersApi
import com.example.data.remote.dto.CharactersItem
import com.example.data.domain.CharacterRepository

import javax.inject.Inject

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
class CharacterRepositoryImpl @Inject constructor(private val charactersApi: CharactersApi) :
    CharacterRepository {

    override suspend fun getCharacters(): List<CharactersItem> {
        return charactersApi.getCharacters()
    }

    override suspend fun getCharactersById(id: Int): CharactersItem {
        return charactersApi.getCharactersById(id)
    }
}