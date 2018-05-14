package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.DividerItem


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class DividerHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_divider) {

    fun onBind(item: DividerItem) {
        itemView.layoutParams = (itemView.layoutParams as ViewGroup.MarginLayoutParams).apply {
            setMargins(item.marginStartEnd ?: 0,
                    item.marginTop?.toInt() ?: 0,
                    item.marginStartEnd ?: 0,
                    item.marginBottom?.toInt() ?: 0)
        }
    }
}
