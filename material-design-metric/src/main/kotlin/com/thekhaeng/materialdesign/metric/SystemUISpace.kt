@file:JvmName("SystemUISpace")

package com.thekhaeng.materialdesign.metric

import android.os.Build
import androidx.fragment.app.FragmentActivity

/**
 * Created by The Khaeng on 13 May 2018 :)
 */

interface OnSystemUISpaceListener {
    fun onSpace(top: Int, left: Int, right: Int, bottom: Int)
}

fun FragmentActivity.setOnSystemUISpaceListener(listener: OnSystemUISpaceListener?) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
        this.window.decorView.setOnApplyWindowInsetsListener { _, windowInsets ->
            listener?.onSpace(windowInsets?.systemWindowInsetTop ?: 0,
                    windowInsets?.systemWindowInsetLeft ?: 0,
                    windowInsets?.systemWindowInsetRight ?: 0,
                    windowInsets?.systemWindowInsetBottom ?: 0)
            this@setOnSystemUISpaceListener
                    .window.decorView.onApplyWindowInsets(windowInsets)
        }
    }else{
        listener?.onSpace(0,0,0,0)
    }
}

