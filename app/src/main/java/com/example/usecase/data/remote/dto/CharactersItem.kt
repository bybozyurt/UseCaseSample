package com.example.usecase.data.remote.dto

import com.example.usecase.domain.model.Characters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
data class CharactersItem (

    @SerializedName("actor")
    val actor: String,

    @SerializedName("alive")
    val alive: Boolean,

    @SerializedName("ancestry")
    val ancestry: String,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String,

    @SerializedName("eyeColour")
    val eyeColour: String,

    @SerializedName("gender")
    val gender: String,

    @SerializedName("hairColour")
    val hairColour: String,

    @SerializedName("hogwartsStaff")
    val hogwartsStaff: Boolean,

    @SerializedName("hogwartsStudent")
    val hogwartsStudent: Boolean,

    @SerializedName("house")
    val house: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("patronus")
    val patronus: String,

    @SerializedName("species")
    val species: String,

    @SerializedName("yearOfBirth")
    val yearOfBirth: String,

    @Expose
    var flag : Boolean = false,

    )

fun CharactersItem.toCharacters() : Characters {
    return Characters(actor,ancestry,house, image, name, patronus)
}

