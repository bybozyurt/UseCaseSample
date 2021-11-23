package com.example.usecase.presentation.character_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.usecase.common.Resource
import com.example.usecase.data.remote.dto.CharactersItem
import com.example.usecase.data.repository.CharacterRepositoryImpl
import com.example.usecase.domain.use_case.get_characters.GetCharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase,
    private val characterRepositoryImpl: CharacterRepositoryImpl
) :
    ViewModel() {

    private val _state = mutableStateOf(CharacterListState())
    val state: State<CharacterListState> = _state


    init {
        getCharacters()
    }

    fun getCharacters() {
        getCharactersUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CharacterListState(characters = result.data ?: emptyList())
                }
                is Resource.Loading -> {
                    _state.value = CharacterListState(isLoading = true)
                }
                is Resource.Error -> {
                    _state.value = CharacterListState(error = result.message ?: "Unexpected error")
                }
            }
        }.launchIn(viewModelScope)
    }





}