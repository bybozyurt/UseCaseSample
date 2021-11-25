package com.example.usecase.data.remote

import com.example.usecase.data.remote.dto.CharactersItem
import com.example.usecase.domain.model.Characters
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
interface CharactersApi {
    @GET("api/v2/Characters")
    suspend fun getCharacters() : List<CharactersItem>

    @GET("api/v2/Characters/{id}")
    suspend fun getCharactersById(@Path("id") id : Int) : CharactersItem


}