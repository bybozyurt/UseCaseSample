package com.example.usecase.presentation.character_list.components

import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.usecase.domain.model.Characters
import com.google.accompanist.coil.rememberCoilPainter

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@Composable
//fun CharacterListItem(characters: Characters, onItemClick : (Characters) -> Unit)
//clickable{onItemClick(characters)}
fun CharacterListItem(characters: Characters) {

//    Row(
//        Modifier
//            .fillMaxWidth()
//            .clickable { onItemClick(characters) }
//            .padding(10.dp),
//        Arrangement.SpaceBetween
//    ){}

    Card(
        modifier = Modifier
            .padding(10.dp, 5.dp, 10.dp, 5.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 12.dp
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(Color.White)
        ) {
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

            Column(
                modifier = Modifier
                    .padding(start = 15.dp)
                    .align(CenterVertically)
            ) {
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
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
        }
    }

}



