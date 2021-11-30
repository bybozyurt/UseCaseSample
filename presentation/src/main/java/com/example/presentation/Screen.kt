package com.example.presentation

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
sealed class Screen(val route : String){
    object CharacterListScreen : Screen("character_list")
    object CharacterDetailScreen : Screen("character_detail")
}
