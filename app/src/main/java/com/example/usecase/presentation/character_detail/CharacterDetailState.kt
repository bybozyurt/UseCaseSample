package com.example.usecase.presentation.character_detail

import com.example.usecase.domain.model.Characters

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */

data class CharacterDetailState (
    val isLoading: Boolean = false,
    val characters: Characters? = null,
    val error: String = "",

    )

