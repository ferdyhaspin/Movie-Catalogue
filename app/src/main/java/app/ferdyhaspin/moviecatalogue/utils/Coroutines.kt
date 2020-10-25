package app.ferdyhaspin.moviecatalogue.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by ferdyhaspin on 25/10/20.
 * Copyright (c) 2020 Movie Catalogue All rights reserved.
 */
object Coroutines {

    fun main(work: suspend (CoroutineScope) -> Unit) = CoroutineScope(Dispatchers.Main).launch {
        work(this)
    }

    fun io(work: suspend (() -> Unit)) = CoroutineScope(Dispatchers.IO).launch {
        work()
    }
}