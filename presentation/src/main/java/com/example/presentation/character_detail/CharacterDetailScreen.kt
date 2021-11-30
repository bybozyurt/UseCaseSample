package com.example.presentation.character_detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        state.characters?.let { characters ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                //Coil Image
                val image = rememberCoilPainter(
                    request = "${characters.imageUrl}",
                    fadeIn = true,
                )

                Image(
                    painter = image,
                    contentDescription = "Character Image",
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .width(150.dp)
                        .height(150.dp)
                        .wrapContentHeight(Alignment.CenterVertically)
                        .padding(5.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "${characters.fullName}",
                    modifier = Modifier.padding(start = 15.dp, end = 10.dp),
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "${characters.family}",
                    modifier = Modifier.padding(start = 15.dp, end = 10.dp),
                    style = MaterialTheme.typography.h5
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "${characters.title}",
                    modifier = Modifier.padding(start = 15.dp, end = 10.dp),
                    style = MaterialTheme.typography.h5
                )
            }


        }
    if (state.error.isNotBlank()) {
        Text(
            text = state.error,
            color = MaterialTheme.colors.error,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)

        )
    }
        if (state.isLoading) {
            Spacer(modifier = Modifier.size(20.dp))
            CircularProgressIndicator()
        }
    }


}



