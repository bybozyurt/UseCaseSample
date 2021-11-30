package com.example.common

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

/**
 * Created by Ahmet Bozyurt on 30.11.2021
 */

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.toast(@StringRes messageResId: Int) {
    Toast.makeText(this, getString(messageResId), Toast.LENGTH_SHORT).show()
}
