package com.example.data.domain.model

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
 data class Characters (
    val id: Int,
    val firstName: String,
    val lastName: String,
    val fullName: String,
    val title: String,
    val family: String,
    val imageUrl: String,
    var randomNumber: Int
)