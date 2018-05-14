package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.holder_color_palette.view.*
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.ColorItem


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class ColorPaletteHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_color_palette) {


    private lateinit var colorViews: MutableList<View>

    override
    fun setupView() {
        colorViews = mutableListOf()
        colorViews.add(itemView.md_color_50)
        colorViews.add(itemView.md_color_100)
        colorViews.add(itemView.md_color_200)
        colorViews.add(itemView.md_color_300)
        colorViews.add(itemView.md_color_400)
        colorViews.add(itemView.md_color_500)
        colorViews.add(itemView.md_color_600)
        colorViews.add(itemView.md_color_700)
        colorViews.add(itemView.md_color_800)
        colorViews.add(itemView.md_color_900)
        colorViews.add(itemView.md_color_a100)
        colorViews.add(itemView.md_color_a200)
        colorViews.add(itemView.md_color_a400)
        colorViews.add(itemView.md_color_a700)
    }

    fun onBind(item: ColorItem) {
        for (i in colorViews.indices) {
            val resId = item.colors[i]
            if (resId != 0) {
                colorViews[i].setBackgroundResource(resId)
            }
        }
    }
}
