package com.example.usecase.presentation.character_detail

import android.os.Bundle
import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.usecase.common.Constants
import com.example.usecase.common.Resource
import com.example.usecase.domain.use_case.get_character.GetCharacterDetailUseCase
import com.example.usecase.presentation.character_list.CharacterListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@HiltViewModel
class CharacterDetailViewModel @Inject constructor(
    private val getCharacterDetailUseCase: GetCharacterDetailUseCase,
    savedStateHandle: SavedStateHandle) :
    ViewModel() {

    private val _state = mutableStateOf(CharacterDetailState())
    val state: State<CharacterDetailState> = _state


    init {
        // yollanan argumanların keylere göre alınması
        savedStateHandle.get<String>(Constants.NAME)?.let { name ->
            //getCharacterDetail(name)
            _state.value = CharacterDetailState(name = name)
        }
//        savedStateHandle.get<String>(Constants.IMAGE)?.let {
//            _state.value = CharacterDetailState(image = it)
//        }
        savedStateHandle.get<String>(Constants.HOUSE)?.let { house ->

            _state.value = CharacterDetailState(house = house)
        }
        savedStateHandle.get<String>(Constants.ACTOR)?.let { actor ->

            _state.value = CharacterDetailState(actor = actor)
        }
        savedStateHandle.get<String>(Constants.ANCESTRY)?.let { ancestry ->

            _state.value = CharacterDetailState(ancestry = ancestry)
        }


    }



//    fun getCharacterDetail(name : String){
//        getCharacterDetailUseCase(name).onEach { result ->
//            when(result){
//                is Resource.Success -> {
//                    _state.value = CharacterDetailState(characters = result.data)
//                }
//                is Resource.Loading -> {
//                    _state.value = CharacterDetailState(isLoading = true)
//                }
//                is Resource.Error -> {
//                    _state.value = CharacterDetailState(error = result.message ?: "Unexpected error")
//                }
//            }
//        }.launchIn(viewModelScope)
//    }

}