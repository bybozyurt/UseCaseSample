package com.example.presentation.character_list

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.domain.model.Characters
import com.example.data.domain.usecase.get_characters.GetCharactersUseCase
import com.example.data.local.CharactersDao
import com.example.data.remote.dto.CharactersItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase,
    private val charactersDao: CharactersDao
) :
    ViewModel() {

    private val _state = mutableStateOf(CharacterListState())
    val state: State<CharacterListState> = _state

    var rnd = (0..100).random()


    init {
        getCharacters()
    }

    fun getCharacters() {
        getCharactersUseCase().onEach { result ->
            when (result) {
                is com.example.common.Resource.Success -> {
                    val characters = mutableListOf<Characters>()
                    result.data?.forEach {
                        it.randomNumber = (1..100).random()
                        charactersDao.deleteAllCharacters()
                        charactersDao.insertAll(*characters.toTypedArray())
                        characters.add(it)}
                    _state.value = CharacterListState(characters = characters ?: emptyList())
                    Log.d("Tag","get data from api")
                }
                is com.example.common.Resource.Loading -> {
                    _state.value = CharacterListState(isLoading = true)
                }
                is com.example.common.Resource.Error -> {
                    _state.value = CharacterListState(error = result.message ?: "Unexpected error")
                }
            }
        }.launchIn(viewModelScope)
    }

    fun getCharactersFromSqlite(){
        viewModelScope.launch {
            val characters = charactersDao.getAllCharacters()
            _state.value = CharacterListState(characters = characters)
            Log.d("TAG","get data from sql")
        }
    }





}