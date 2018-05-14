package com.thekhaeng.materialstyletemplate.tab

import androidx.annotation.IntDef


/**
 * Created by「 The Khaeng 」on 12 May 2018 :)
 */

object State{
    const val COLLAPSED = 1
    const val EXPANDED = 2
    const val IDLE = 3
}


@IntDef(State.COLLAPSED,
        State.EXPANDED,
        State.IDLE)
@Retention(AnnotationRetention.SOURCE)
annotation class AppbarState

interface OnAppbarChangeStateListener {
    fun onChangeState(@AppbarState state: Int)
}


