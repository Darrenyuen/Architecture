package com.example.architecture

import android.util.Log
import android.view.View

/**
 *yuan
 *2020/7/18
 **/
class ModuleA(private val rootView: View) : IBusinessDispatcher<BusinessDispatcher>, Behavior{

    private val TAG = "ModuleA"

    lateinit var businessDispatcher: BusinessDispatcher

    override fun registerBusinessDispatcher(dispatcher: BusinessDispatcher) {
        businessDispatcher = dispatcher
    }

    override fun showOrHide(show: Boolean) {
//        runOnUIThread {
            if (show) {
                Log.i(TAG, "show module A")
                rootView.visibility = View.VISIBLE
            } else {
                rootView.visibility = View.GONE
            }
//        }
    }
}