package com.thekhaeng.materialstyletemplate.adapter.item

import androidx.annotation.ColorInt
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_TOPIC
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

class TopicItem(val topic: String,
                @ColorInt val color: Int) : BaseItem(TYPE_TOPIC)
