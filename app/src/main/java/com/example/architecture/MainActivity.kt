package com.example.architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {

    lateinit var businessDispatcher: BusinessDispatcher

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val container = findViewById<ViewGroup>(android.R.id.content)
        businessDispatcher = BusinessDispatcher(this)
        val rootView = LayoutInflater.from(this).inflate(R.layout.activity_main, container)

        businessDispatcher.onCreateView(rootView)
    }
}
