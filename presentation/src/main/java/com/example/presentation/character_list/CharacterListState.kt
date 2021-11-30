package com.example.presentation.character_list

import com.example.data.domain.model.Characters

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
data class CharacterListState (
    val isLoading : Boolean = false,
    val characters : List<Characters> = emptyList(),
    val error : String = ""
)


