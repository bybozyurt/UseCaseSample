package com.example.usecase.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.usecase.presentation.character_detail.CharacterDetailScreen
import com.example.usecase.presentation.character_list.CharacterListScreen
import com.example.usecase.presentation.ui.theme.HaryyPotterAppYTTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContent{
            HaryyPotterAppYTTheme {
                Surface(color = MaterialTheme.colors.background){
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CharacterListScreen.route
                    ){
                        composable(route = Screen.CharacterListScreen.route) {
                            CharacterListScreen(navController)
                        }
                        composable(
                            route = Screen.CharacterDetailScreen.route + "/{id}",
                            arguments = listOf(
                                navArgument("id"){
                                    type = NavType.IntType
                                }
                            )
                        )
                        {
                            CharacterDetailScreen()
                        }
                    }
                }
            }
        }
    }
}
