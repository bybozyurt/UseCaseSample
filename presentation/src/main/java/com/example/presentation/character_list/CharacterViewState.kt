package com.example.presentation.character_list

import com.example.data.remote.dto.CharactersItem

/**
 * Created by Ahmet Bozyurt on 23.11.2021
 */
sealed class CharacterViewState{
    data class CharacterList(val characterList: List<CharactersItem>) : CharacterViewState()
}
