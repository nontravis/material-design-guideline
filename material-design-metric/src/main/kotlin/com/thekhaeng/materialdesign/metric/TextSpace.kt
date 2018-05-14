@file:JvmName("TextSpace")

package com.thekhaeng.materialdesign.metric

import android.widget.TextView


/**
 * Created by The Khaeng on 12 May 2018 :)
 */


fun TextView.setLineHeight(lineHeightPx: Float) {
    this.setLineSpacing(lineHeightPx - this.lineHeight, 1.0f)
}

fun TextView.scaleLineSpaceByTextSize(scale: Float) {
    this.setLineSpacing((this.textSize * scale) - this.lineHeight, 1.0f)
}


