package com.thekhaeng.materialstyletemplate.adapter.holder

import android.annotation.SuppressLint
import android.view.ViewGroup
import com.thekhaeng.materialdesign.metric.pxToSpInt
import kotlinx.android.synthetic.main.holder_text.view.*
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.TextItem


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class TextHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_text) {


    @SuppressLint("SetTextI18n")
    fun onBind(item: TextItem) {
        itemView.apply {
            tv_headline_1_size?.text = "Light\t\t\t\t ${pxToSpInt(tv_headline_1.textSize)} sp"
            tv_headline_2_size?.text= "Light\t\t\t\t ${pxToSpInt(tv_headline_2.textSize)} sp"
            tv_headline_3_size?.text= "Regular\t\t ${pxToSpInt(tv_headline_3.textSize)} sp"
            tv_headline_4_size?.text= "Regular\t\t ${pxToSpInt(tv_headline_4.textSize)} sp"
            tv_headline_5_size?.text= "Regular\t\t ${pxToSpInt(tv_headline_5.textSize)} sp"
            tv_headline_6_size?.text= "Medium\t\t ${pxToSpInt(tv_headline_6.textSize)} sp"
            tv_subtitle_1_size?.text= "Regular\t\t ${pxToSpInt(tv_subtitle_1.textSize)} sp"
            tv_subtitle_2_size?.text= "Medium\t\t ${pxToSpInt(tv_subtitle_2.textSize)} sp"
            tv_body_1_size?.text= "Regular\t\t ${pxToSpInt(tv_body_1.textSize)} sp"
            tv_body_2_size?.text= "Regular\t\t ${pxToSpInt(tv_body_2.textSize)} sp"
            tv_button_size?.text= "Medium\t\t ${pxToSpInt(tv_button.textSize)} sp"
            tv_caption_size?.text= "Regular\t\t ${pxToSpInt(tv_caption.textSize)} sp"
            tv_overline_size?.text= "Regular\t\t ${pxToSpInt(tv_overline.textSize)} sp"
        }
    }
}
