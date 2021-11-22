package com.example.usecase.data.remote

import com.example.usecase.data.remote.dto.CharactersItem
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
interface CharactersApi {
    @GET("api/characters")
    suspend fun getCharacters() : List<CharactersItem>

    @GET("api/characters/{name}")
    suspend fun getCharactersByName(@Path("name") name : String)
}