package com.thekhaeng.materialstyletemplate.base

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment

/**
 * Created by「 The Khaeng 」on 02 Oct 2017 :)
 */

abstract class BaseFragment
    : Fragment() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            onRestoreInstanceStates(savedInstanceState)
        }
    }

    override
    fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val layoutResId = setupLayoutView()
        if (setupLayoutView() == 0) throw RuntimeException("setupLayoutView() before.")
        return inflater.inflate(layoutResId, container, false)
    }


    override
    fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onInitialize(savedInstanceState)
        if (savedInstanceState == null) {
            onPrepareInstance()
        }
        onSetupView(savedInstanceState)
        if (savedInstanceState != null) {
            onRestoreInstanceStatesToView(savedInstanceState)
        }
    }

    @Suppress("NAME_SHADOWING")
    override
    fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }


    override
    fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }


    open fun onRestoreInstanceStates(savedInstanceState: Bundle) {
    }

    open fun onRestoreInstanceStatesToView(savedInstanceState: Bundle) {
    }


    abstract fun setupLayoutView(): Int


    open fun onInitialize(savedInstanceState: Bundle?) {}

    open fun onSetupView(savedInstanceState: Bundle?) {}

    open fun onPrepareInstance() {}


    fun animationElevationUp(view: View, elevation: Float) {
        if(ViewCompat.getTranslationZ(view) != elevation){
            ObjectAnimator.ofFloat(view, "translationZ", 0f, elevation).apply {
                duration = 100
            }.start()
        }
    }

    fun animationElevationDown(view: View) {
        if(ViewCompat.getTranslationZ(view) > 0){
            ObjectAnimator.ofFloat(view, "translationZ", ViewCompat.getTranslationZ(view), 0f).apply {
                duration = 100
            }.start()
        }
    }

}
