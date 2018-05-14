package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.SpaceItem


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class SpaceHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_space) {

    fun onBind(item: SpaceItem) {
        itemView.layoutParams = (itemView.layoutParams).apply {
            height = item.space?.toInt() ?: 0
        }
    }
}
