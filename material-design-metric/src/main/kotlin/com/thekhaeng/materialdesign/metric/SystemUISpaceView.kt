package com.thekhaeng.materialdesign.metric

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Rect
import android.os.Build
import android.util.AttributeSet
import android.view.View
import android.view.WindowInsets
import androidx.annotation.RequiresApi


/**
 * Created by The Khaeng on 21 Apr 2018 :)
 */
class SystemUISpaceView : View {

    companion object {
        const val TOP = 0
        const val LEFT = 1
        const val RIGHT = 2
        const val BOTTOM = 3
    }

    var topSystemUI: Int = 0
    var bottomSystemUI: Int = 0
    var leftSystemUI: Int = 0
    var rightSystemUI: Int = 0
    var isConsumedInsets: Boolean = false
    var systemUI: Int = TOP

    @JvmOverloads
    constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
            : super(context, attrs, defStyleAttr) {
        setupStyleables(attrs, defStyleAttr, 0)
    }

    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)
            : super(context, attrs, defStyleAttr, defStyleRes) {
        setupStyleables(attrs, defStyleAttr, defStyleRes)
    }

    @Suppress("UNUSED_PARAMETER")
    protected fun setupStyleables(attrs: AttributeSet?,  defStyleAttr: Int, defStyleRes: Int) {
        attrs?.let {
            val attrArray = context.obtainStyledAttributes(attrs, R.styleable.SystemUISpaceView, defStyleRes, 0)
            isConsumedInsets = attrArray.getBoolean(R.styleable.SystemUISpaceView_isConsumeInsets, false)
            systemUI = attrArray.getInt(R.styleable.SystemUISpaceView_systemUI, TOP)
            attrArray.recycle()
        }
    }


    @Suppress("OverridingDeprecatedMember")
    override
    fun fitSystemWindows(insets: Rect): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT_WATCH) {
            topSystemUI = insets.top
            leftSystemUI = insets.left
            rightSystemUI = insets.right
            bottomSystemUI = insets.bottom
        }
        return isConsumedInsets
    }

    @SuppressLint("NewApi")
    @RequiresApi(Build.VERSION_CODES.KITKAT_WATCH)
    override
    fun onApplyWindowInsets(insets: WindowInsets?): WindowInsets {
        topSystemUI = insets?.systemWindowInsetTop ?: 0
        leftSystemUI = insets?.systemWindowInsetLeft ?: 0
        rightSystemUI = insets?.systemWindowInsetRight ?: 0
        bottomSystemUI = insets?.systemWindowInsetBottom ?: 0

        return if (isConsumedInsets) {
            super.onApplyWindowInsets(insets?.consumeSystemWindowInsets())
        } else {
            super.onApplyWindowInsets(insets)
        }
    }


    override
    fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        var newHeightMeasureSpec = 0
        var newWidthMeasureSpec = 0
        var width = 0
        var height = 0
        when (systemUI) {
            TOP -> {
                width = View.MeasureSpec.getSize(widthMeasureSpec)
                height = topSystemUI
                newWidthMeasureSpec = widthMeasureSpec
                newHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(
                        topSystemUI,
                        View.MeasureSpec.EXACTLY
                )
            }
            LEFT -> {
                width = leftSystemUI
                height = View.MeasureSpec.getSize(heightMeasureSpec)
                newWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(
                        leftSystemUI,
                        View.MeasureSpec.EXACTLY
                )
                newHeightMeasureSpec = heightMeasureSpec
            }
            RIGHT -> {
                width = rightSystemUI
                height = View.MeasureSpec.getSize(heightMeasureSpec)
                newWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(
                        rightSystemUI,
                        View.MeasureSpec.EXACTLY
                )
                newHeightMeasureSpec = heightMeasureSpec
            }
            BOTTOM -> {
                width = View.MeasureSpec.getSize(widthMeasureSpec)
                height = bottomSystemUI
                newWidthMeasureSpec = widthMeasureSpec
                newHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(
                        bottomSystemUI,
                        View.MeasureSpec.EXACTLY
                )
            }
        }
        super.onMeasure(newWidthMeasureSpec, newHeightMeasureSpec)
        setMeasuredDimension(width, height)
    }

}
