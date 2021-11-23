package com.example.usecase.presentation.character_detail

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.coil.rememberCoilPainter

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */

@Composable
fun CharacterDetailScreen(
    viewModel: CharacterDetailViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Log.d("Tag","naberlan")
    state.characters?.let { Log.d("TAG", "naber"+it.name) }



//    Box(modifier = Modifier.fillMaxWidth()){
//        state.characters?.let { characters ->
//            LazyColumn(
//                modifier = Modifier.fillMaxSize(),
//                contentPadding = PaddingValues(20.dp)
//            ){
//                item {
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.Center
//                    ){
//                        Surface(
//                            modifier = Modifier
//                                .size(100.dp)
//                                .clip(RoundedCornerShape(12.dp))
//                        ) {
//                            //Coil Image
//                            val image = rememberCoilPainter(
//                                request = characters.image,
//                                fadeIn = true
//                            )
//
//                            Image(
//                                painter = image,
//                                contentDescription = "Character Image",
//                                modifier = Modifier
//                                    .clip(RoundedCornerShape(10.dp)),
//                                contentScale = ContentScale.Crop
//                            )
//                        }
//                        Text(
//                            text = "${characters.name}",
//                            fontWeight = FontWeight.Bold,
//                            fontSize = 20.sp,
//                            color = Color.Black
//                        )
//
//                        Text(
//                            text = "${characters.house}",
//                            fontWeight = FontWeight.Normal,
//                            fontSize = 14.sp,
//                            color = Color.Black,
//                            maxLines = 1,
//                        )
//                        Text(
//                            text = "${characters.actor}",
//                            fontWeight = FontWeight.Normal,
//                            fontSize = 14.sp,
//                            color = Color.Black,
//                            maxLines = 1,
//                        )
//                        Text(
//                            text = "${characters.patronus}",
//                            fontWeight = FontWeight.Normal,
//                            fontSize = 14.sp,
//                            color = Color.Black,
//                            maxLines = 1,
//                        )
//                        Text(
//                            text = "${characters.ancestry}",
//                            fontWeight = FontWeight.Normal,
//                            fontSize = 14.sp,
//                            color = Color.Black,
//                            maxLines = 1,
//                        )
//
//                    }
//
//                }
//            }
//        }
//        if (state.error.isNotBlank()){
//            Text(
//                text = state.error,
//                color = MaterialTheme.colors.error,
//                textAlign = TextAlign.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 20.dp)
//                    .align(Alignment.Center)
//            )
//        }
//        if (state.isLoading){
//            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
//        }
//    }

    Box(modifier = Modifier.fillMaxWidth()) {
        state.characters?.let { characters ->

            Surface(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp))
            ) {
                //Coil Image
                val image = rememberCoilPainter(
                    request = characters.image,
                    fadeIn = true
                )

                Image(
                    painter = image,
                    contentDescription = "Character Image",
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                text = "${characters.name}",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )

            Text(
                text = "${characters.house}",
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                maxLines = 1,
            )
            Text(
                text = "${characters.actor}",
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                maxLines = 1,
            )
            Text(
                text = "${characters.patronus}",
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                maxLines = 1,
            )
            Text(
                text = "${characters.ancestry}",
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                color = Color.Black,
                maxLines = 1,
            )

        }
        if (state.error.isNotBlank()) {
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
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }


}