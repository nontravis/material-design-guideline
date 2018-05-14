package com.thekhaeng.materialstyletemplate.widgets

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


/**
 * Created by「 The Khaeng 」on 12 May 2018 :)
 */
class PreCachingLayoutManager : LinearLayoutManager {

    companion object {
        const val DEFAULT_EXTRA_LAYOUT_SPACE = 600
    }

    private var extraLayoutSpace = DEFAULT_EXTRA_LAYOUT_SPACE
    private var context: Context? = null

    constructor(context: Context) : super(context) {
        this.context = context
    }

    constructor(context: Context, extraLayoutSpace: Int) : super(context) {
        this.context = context
        this.extraLayoutSpace = extraLayoutSpace
    }

    constructor(context: Context, orientation: Int, reverseLayout: Boolean) : super(context, orientation, reverseLayout) {
        this.context = context
    }

    fun setExtraLayoutSpace(extraLayoutSpace: Int) {
        this.extraLayoutSpace = extraLayoutSpace
    }

    override
    fun getExtraLayoutSpace(state: RecyclerView.State): Int {
        return if (extraLayoutSpace > 0) extraLayoutSpace else DEFAULT_EXTRA_LAYOUT_SPACE
    }
}
