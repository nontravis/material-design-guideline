package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.DescriptionItem
import kotlinx.android.synthetic.main.holder_description.view.holder_description_tv as tvDesc

/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class DescriptionHolder(viewGroup: ViewGroup)
    : BaseViewHolder(viewGroup, R.layout.holder_description) {

    fun onBind(item: DescriptionItem) {
        itemView.apply {
            tvDesc.text = item.desc
        }
    }
}
