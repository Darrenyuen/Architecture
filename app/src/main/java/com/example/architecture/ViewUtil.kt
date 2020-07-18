package com.example.architecture

import android.os.Handler
import android.os.Looper

/**
 *yuan
 *2020/7/18
 **/
private val uiThreadHandler = Handler(Looper.getMainLooper())

fun runOnUIThread(action: () -> Unit) {
    if (Looper.myLooper() == Looper.getMainLooper()) {
        action.invoke()
    } else {
        uiThreadHandler.post(action)
    }
}