package com.example.architecture

import androidx.annotation.UiThread

/**
 *yuan
 *2020/7/18
 **/
interface Behavior {
    @UiThread
    fun showOrHide(show: Boolean)
}