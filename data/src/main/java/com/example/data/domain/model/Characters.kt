package com.example.data.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@Entity
 data class Characters (
   @PrimaryKey
   @ColumnInfo(name = "id")
    val id: Int,

   @ColumnInfo(name = "firstName")
    val firstName: String,

   @ColumnInfo(name = "lastName")
    val lastName: String,

   @ColumnInfo(name = "fullName")
    val fullName: String,

   @ColumnInfo(name = "title")
   val title: String,

   @ColumnInfo(name = "family")
    val family: String,

   @ColumnInfo(name = "imageUrl")
    val imageUrl: String,

   @ColumnInfo(name = "randomNumber")
    var randomNumber: Int,

   @ColumnInfo(name = "flag")
    var flag : Boolean
)