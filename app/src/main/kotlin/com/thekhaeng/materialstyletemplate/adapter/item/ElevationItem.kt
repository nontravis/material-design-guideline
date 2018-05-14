package com.thekhaeng.materialstyletemplate.adapter.item

import android.view.Gravity
import androidx.annotation.DimenRes
import com.thekhaeng.materialdesign.metric.dpToPx
import com.thekhaeng.materialdesign.metric.dpToPxInt
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_ELEVATION
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

class ElevationItem(
        val width: Int,
        val height: Int,
        var marginStart: Int = dpToPxInt(0),
        var marginEnd: Int = dpToPxInt(0),
        var marginTop: Int = dpToPxInt(0),
        var marginBottom: Int = dpToPxInt(0),
        var corner: Float = dpToPx(2),
        var gravity: Int = Gravity.CENTER,
        @DimenRes var elevationRes: Int,
        var name: String
) : BaseItem(TYPE_ELEVATION)
