package com.example.presentation.character_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.presentation.Screen
import com.example.presentation.character_list.components.CharacterListItem
import com.example.presentation.character_list.components.TopBar

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@Composable
fun CharacterListScreen(
    navController: NavController,
    viewModel: CharacterListViewModel = hiltViewModel()
){
    val state = viewModel.state.value


    Scaffold(topBar = {
        TopBar(
        onItemClick = {viewModel.getCharacters()})
    }
    ){
        Box(modifier = Modifier.fillMaxSize()) {

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(state.characters){character ->
                    CharacterListItem(
                        characters = character,
                        onItemClick = {
                            navController.navigate(
                                Screen.CharacterDetailScreen.route + "/${character.id}")
                        }
                    )
                }
            }
            if(state.error.isNotBlank()) {
                Text(
                    text = state.error,
                    color = MaterialTheme.colors.error,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .align(Alignment.Center)
                )
            }
            if(state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }


}

