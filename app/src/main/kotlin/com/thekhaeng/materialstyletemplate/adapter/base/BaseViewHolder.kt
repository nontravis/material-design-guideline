package com.thekhaeng.materialstyletemplate.adapter.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Nonthawit on 7/30/2016.
 */

abstract class BaseViewHolder(parent: ViewGroup, layout: Int)
    : RecyclerView.ViewHolder(
        LayoutInflater
                .from(parent.context)
                .inflate(layout, parent, false)) {

    val context: Context
        get() = itemView.context

    init {
        setupView()
    }


    open fun setupView() {}

}
