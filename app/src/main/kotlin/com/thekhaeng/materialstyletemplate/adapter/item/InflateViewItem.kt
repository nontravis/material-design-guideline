package com.thekhaeng.materialstyletemplate.adapter.item

import androidx.annotation.LayoutRes
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_INFLATE_VIEW
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

class InflateViewItem(
        @LayoutRes val layoutRes: Int
) : BaseItem(TYPE_INFLATE_VIEW)
