package com.example.usecase.presentation.character_detail

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
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
    Log.d("TAG", "work" + state.name)


//    Box(modifier = Modifier.fillMaxWidth()) {
//        state.let {
//            Surface(
//                modifier = Modifier
//                    .size(100.dp)
//                    .clip(RoundedCornerShape(12.dp))
//            ) {
//                //Coil Image
//                val image = rememberCoilPainter(
//                    request = "${state.image}",
//                    fadeIn = true
//                )
//
//                Image(
//                    painter = image,
//                    contentDescription = "Character Image",
//                    modifier = Modifier
//                        .clip(RoundedCornerShape(10.dp)),
//                    contentScale = ContentScale.Crop
//                )
//            }
//            Text(
//                text = "${state.name}",
//                fontWeight = FontWeight.Bold,
//                fontSize = 20.sp,
//                color = Color.Black
//            )
//
//            Text(
//                text = "${state.actor}",
//                fontWeight = FontWeight.Normal,
//                fontSize = 14.sp,
//                color = Color.Black,
//                maxLines = 1,
//                overflow = TextOverflow.Ellipsis,
//                modifier = Modifier.padding(top = 10.dp)
//            )
//            Text(
//                text = "${state.house}",
//                fontWeight = FontWeight.Normal,
//                fontSize = 14.sp,
//                color = Color.Black,
//                maxLines = 1,
//                overflow = TextOverflow.Ellipsis,
//                modifier = Modifier.padding(top = 10.dp)
//            )
//            Text(
//                text = "${state.ancestry}",
//                fontWeight = FontWeight.Normal,
//                fontSize = 14.sp,
//                color = Color.Black,
//                maxLines = 1,
//                overflow = TextOverflow.Ellipsis,
//                modifier = Modifier.padding(top = 10.dp)
//            )
//        }


    Surface(

        modifier = Modifier.fillMaxSize()
    ) {


        Column(modifier = Modifier.verticalScroll(rememberScrollState()).padding(bottom = 5.dp)) {

            //Coil Image
            val image = rememberCoilPainter(
                request = "${state.image}",
                fadeIn = true
            )

            Image(
                painter = image,
                contentDescription = "Character Image",
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 120.dp),
                horizontalArrangement = Arrangement.Center
            ) { }


        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "${state.name}",
            modifier = Modifier.padding(start = 15.dp, end = 10.dp),
            style = MaterialTheme.typography.h3
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "${state.actor}",
            modifier = Modifier.padding(start = 17.dp, end = 10.dp),
            style = MaterialTheme.typography.h5
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "${state.house}",
            modifier = Modifier.padding(start = 17.dp, end = 10.dp),
            style = MaterialTheme.typography.h5
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "${state.ancestry}",
            modifier = Modifier.padding(start = 17.dp, end = 10.dp),
            style = MaterialTheme.typography.h5
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

        )
    }
    if (state.isLoading) {
        CircularProgressIndicator()
    }
}



