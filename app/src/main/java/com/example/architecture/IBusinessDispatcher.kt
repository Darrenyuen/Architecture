package com.example.architecture

/**
 *yuan
 *2020/7/18
 **/
interface IBusinessDispatcher<in T> {
    fun registerBusinessDispatcher(dispatcher: T)
}