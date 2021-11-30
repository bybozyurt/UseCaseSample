package com.example.data.remote

import com.example.data.remote.dto.CharactersItem
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