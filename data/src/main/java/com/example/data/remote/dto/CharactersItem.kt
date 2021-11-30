package com.example.data.remote.dto


import com.example.data.domain.model.Characters
import com.google.gson.annotations.SerializedName

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
data class CharactersItem (

    @SerializedName("id")
    val id: Int,

    @SerializedName("firstName")
    val firstName: String,

    @SerializedName("lastName")
    val lastName: String,

    @SerializedName("fullName")
    val fullName: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("family")
    val family: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("imageUrl")
    val imageUrl: String,


    var randomNumber : Int,

    )

fun CharactersItem.toCharacters() : Characters {
    return Characters(
        family = family,
        id = id,
        firstName = firstName,
        fullName = fullName,
        lastName = lastName,
        title = title,
        imageUrl = imageUrl,
        randomNumber = randomNumber
    )
}

