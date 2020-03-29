package com.jizhe7550.myapplication.util

import android.util.Log
import com.jizhe7550.myapplication.util.Constants.DEBUG
import com.jizhe7550.myapplication.util.Constants.TAG

fun printLogD(className: String?, message: String ) {
    if (DEBUG) {
        Log.d(TAG, "$className: $message")
    }
}