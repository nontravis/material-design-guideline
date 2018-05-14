package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.ViewGroup
import kotlinx.android.synthetic.main.holder_topic.view.*
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.TopicItem


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class TopicHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_topic) {

    fun onBind(item: TopicItem) {
        itemView.tv_topic?.text = item.topic
        itemView.tv_topic?.setTextColor(item.color)
    }
}
