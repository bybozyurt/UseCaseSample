package com.example.data.remote.dto


import android.text.BoringLayout
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.domain.model.Characters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
//@Entity
data class CharactersItem (

//    @PrimaryKey
//    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: Int,

    //@ColumnInfo(name = "firstName")
    @SerializedName("firstName")
    val firstName: String,

    //@ColumnInfo(name = "lastName")
    @SerializedName("lastName")
    val lastName: String,

    //@ColumnInfo(name = "fullName")
    @SerializedName("fullName")
    val fullName: String,

    //@ColumnInfo(name = "title")
    @SerializedName("title")
    val title: String,

    //@ColumnInfo(name = "family")
    @SerializedName("family")
    val family: String,

    //@ColumnInfo(name = "image")
    @SerializedName("image")
    val image: String,

   // @ColumnInfo(name = "imageUrl")
    //@SerializedName("imageUrl")
    val imageUrl: String,

    //@ColumnInfo(name = "randomNumber")
    var randomNumber : Int,

    //@ColumnInfo(name = "flag")
    @Expose
    var flag : Boolean = false,

    )

fun CharactersItem.toCharacters() : Characters {
    return Characters(
        family = family,
        id = id,
        firstName = firstName,
        fullName = fullName,
        lastName = lastName,
        title = title,
        imageUrl = imageUrl,
        randomNumber = randomNumber,
        flag = flag
    )
}

