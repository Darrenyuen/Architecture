package com.example.architecture

import android.view.View

/**
 *yuan
 *2020/7/18
 **/
interface IExport {
    fun onCreateView(view: View)

    fun onViewCreated()

    fun onResume()

    fun onStop()

    fun onBackPress(): Boolean
}