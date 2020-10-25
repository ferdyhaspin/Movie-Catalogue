/*
 * Created by Ferdi Haspi Nur Imanulloh on 2/5/20 5:26 PM
 */

package app.ferdyhaspin.moviecatalogue.utils

import android.util.Log
import app.ferdyhaspin.moviecatalogue.BuildConfig

fun logDebug(tag: String, massage: String) {
    if (BuildConfig.DEBUG) {
        Log.d(tag, massage)
    }
}

fun logInfo(tag: String, massage: String) {
    if (BuildConfig.DEBUG) {
        Log.i(tag, massage)
    }
}

fun logError(tag: String, massage: String) {
    if (BuildConfig.DEBUG) {
        Log.e(tag, massage)
    }
}
