@file:JvmName("TabletDevice")

package com.thekhaeng.materialdesign.metric

import android.content.Context
import androidx.fragment.app.Fragment

/**
 * Created by The Khaeng on 13 May 2018 :)
 */

val Context.isTablet: Boolean
    get() = this.resources.getBoolean(R.bool.is_tablet)

val Fragment.isTablet: Boolean
    get() = this.resources.getBoolean(R.bool.is_tablet)
