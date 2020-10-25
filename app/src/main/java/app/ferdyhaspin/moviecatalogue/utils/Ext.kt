package app.ferdyhaspin.moviecatalogue.utils

import android.content.Context
import android.content.Intent
import com.google.gson.Gson

/**
 * Created by ferdyhaspin on 25/10/20.
 * Copyright (c) 2020 Movie Catalogue All rights reserved.
 */

infix fun Context.goTo(cls: Class<*>) {
    startActivity(Intent(this, cls))
}

inline fun <reified T> String.toObject(): T = Gson().fromJson(this, T::class.java)

inline fun <reified T> Context.parseRawJSON(id: Int): T {
    val jsonString = resources
        .openRawResource(id)
        .bufferedReader()
        .use {
            it.readText()
        }
    return jsonString.toObject()
}