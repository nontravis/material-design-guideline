package com.thekhaeng.materialstyletemplate.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager


/**
 * Created by「 The Khaeng 」on 24 Jan 2018 :)
 */
class NonSwipeViewPager : ViewPager {
    private var disable: Boolean = false

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun
            onInterceptTouchEvent(event: MotionEvent): Boolean {
        return if (disable) false else super.onInterceptTouchEvent(event)
    }

    override
    fun onTouchEvent(event: MotionEvent): Boolean {
        return if (disable) false else super.onTouchEvent(event)
    }

    fun disableSwipe(disable: Boolean) {
        //When disable = true not work the scroll and when disble = false work the scroll
        this.disable = disable
    }
}