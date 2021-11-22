package com.example.usecase.presentation.character_list

import com.example.usecase.domain.model.Characters

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
data class CharacterListState (
    val isLoading : Boolean = false,
    val characters : List<Characters> = emptyList(),
    val error : String = ""
)


