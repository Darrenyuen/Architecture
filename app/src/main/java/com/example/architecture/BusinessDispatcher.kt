package com.example.architecture

import android.util.Log
import android.view.View
import android.widget.Button

/**
 *yuan
 *2020/7/18
 * 业务中控
 **/
class BusinessDispatcher(val activity: MainActivity) : IExport, View.OnClickListener{

    private val TAG = "BusinessDispatcher"

    lateinit var moduleA: ModuleA

    lateinit var moduleB: ModuleB

    lateinit var moduleC: ModuleC

    private var toModuleA: Button? = null

    private var toModuleB: Button? = null

    private var toModuleC: Button? = null

    var mPageState = PageState.ModuleA

    override fun onCreateView(view: View) {


        toModuleA = view.findViewById(R.id.toModuleA)
        toModuleB = view.findViewById(R.id.toModuleB)
        toModuleC = view.findViewById(R.id.toModuleC)

        moduleA = ModuleA(view.findViewById(R.id.module_a))

        moduleB = ModuleB(view.findViewById(R.id.module_b))

        moduleC = ModuleC(view.findViewById(R.id.module_c))
        moduleB.showOrHide(true)
        registerBusinessDispatcher()

        initEvent()
    }

    private fun registerBusinessDispatcher() {
        moduleA.registerBusinessDispatcher(this)

        moduleB.registerBusinessDispatcher(this)

        moduleC.registerBusinessDispatcher(this)
    }

    override fun onViewCreated() {
//        transferPageState(PageState.ModuleA)
        TODO("Not yet implemented")
    }

    private fun initEvent() {
        Log.i(TAG, "initEvent")
//        toModuleA?.setOnClickListener {
//            transferPageState(PageState.ModuleA)
//        }
        Log.i(TAG, "" + (toModuleA == null))
        toModuleA?.setOnClickListener(this)
        toModuleB?.setOnClickListener(this)
        toModuleC?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Log.i(TAG, v?.id.toString())
        when(v?.id) {
            R.id.toModuleA -> transferPageState(PageState.ModuleA)
            R.id.toModuleB -> transferPageState(PageState.ModuleB)
            R.id.toModuleC -> transferPageState(PageState.ModuleC)
        }
    }

    private fun transferPageState(pageState: PageState) {
        Log.i(TAG, pageState.name)
        mPageState = pageState
        moduleA.showOrHide(pageState == PageState.ModuleA)
        moduleB.showOrHide(pageState == PageState.ModuleB)
        moduleC.showOrHide(pageState == PageState.ModuleC)
    }

    override fun onResume() {
        TODO("Not yet implemented")
    }

    override fun onStop() {
        TODO("Not yet implemented")
    }

    override fun onBackPress(): Boolean {
        TODO("Not yet implemented")
    }
}