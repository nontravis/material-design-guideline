package com.thekhaeng.materialstyletemplate.adapter.item

import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_DIVIDER
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

class DividerItem(val marginStartEnd: Int? = 0,
                  var marginTop: Float? = 0f,
                  var marginBottom: Float? = 0f) : BaseItem(TYPE_DIVIDER)
