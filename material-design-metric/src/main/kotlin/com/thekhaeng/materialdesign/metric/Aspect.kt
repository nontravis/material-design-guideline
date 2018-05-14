package com.thekhaeng.materialdesign.metric

import android.content.Context
import android.util.TypedValue

/**
 * Created by The Khaeng on 09 May 2018 :)
 */
object Aspect {

    @JvmStatic
    fun to_16_9(context: Context): Float {
        val outValue = TypedValue()
        context.resources.getValue(R.dimen.md_aspect_16_9, outValue, true)
        return outValue.float
    }

    @JvmStatic
    fun to_3_2(context: Context): Float {
        val outValue = TypedValue()
        context.resources.getValue(R.dimen.md_aspect_3_2, outValue, true)
        return outValue.float
    }

    @JvmStatic
    fun to_4_3(context: Context): Float {
        val outValue = TypedValue()
        context.resources.getValue(R.dimen.md_aspect_4_3, outValue, true)
        return outValue.float
    }

    @JvmStatic
    fun to_1_1(context: Context): Float {
        val outValue = TypedValue()
        context.resources.getValue(R.dimen.md_aspect_1_1, outValue, true)
        return outValue.float
    }

    @JvmStatic
    fun to_3_4(context: Context): Float {
        return 1 / to_4_3(context)
    }

    @JvmStatic
    fun to_2_3(context: Context): Float {
        return 1 / to_3_2(context)
    }
}
