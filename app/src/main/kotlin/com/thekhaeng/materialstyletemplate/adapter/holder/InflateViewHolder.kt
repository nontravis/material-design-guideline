package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.InflateViewItem
import kotlinx.android.synthetic.main.holder_inflate_view.view.holder_inflate_container as container

/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class InflateViewHolder(viewGroup: ViewGroup)
    : BaseViewHolder(viewGroup, R.layout.holder_inflate_view) {

    fun onBind(item: InflateViewItem) {
        itemView.apply {
            container.addView(LayoutInflater.from(context).inflate(item.layoutRes, null))
        }
    }
}
