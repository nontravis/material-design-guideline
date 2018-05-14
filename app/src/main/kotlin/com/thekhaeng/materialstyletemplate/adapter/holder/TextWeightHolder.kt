package com.thekhaeng.materialstyletemplate.adapter.holder

import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.TextWeightItem
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight as tvFontName
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_1 as tvWeightLight
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_2 as tvWeightRegular
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_3 as tvWeightMedium
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_4 as tvWeightBold
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_tv_bold as tvBold
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_tv_light as tvLight
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_tv_medium as tvMedium
import kotlinx.android.synthetic.main.holder_text_weight.view.holder_text_weight_tv_regular as tvRegular


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class TextWeightHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_text_weight) {


    fun onBind(item: TextWeightItem) {
        itemView.apply {
            if (item.fontRes.isNotEmpty() && item.fontRes[0] > 0) {
                tvWeightLight.typeface = ResourcesCompat.getFont(context, item.fontRes[0])
                tvWeightLight.visibility = View.VISIBLE
                tvLight.visibility = View.VISIBLE
            }
            if (item.fontRes.size > 1 && item.fontRes[1] > 0) {
                tvWeightRegular.typeface = ResourcesCompat.getFont(context, item.fontRes[1])
                tvWeightRegular.visibility = View.VISIBLE
                tvRegular.visibility = View.VISIBLE
            }
            if (item.fontRes.size > 2 && item.fontRes[2] > 0) {
                tvWeightMedium.typeface = ResourcesCompat.getFont(context, item.fontRes[2])
                tvWeightMedium.visibility = View.VISIBLE
                tvMedium.visibility = View.VISIBLE
            }
            if (item.fontRes.size > 3 && item.fontRes[3] > 0) {
                tvWeightBold.setTypeface(ResourcesCompat.getFont(context, item.fontRes[3]), Typeface.BOLD)
                tvWeightBold.visibility = View.VISIBLE
                tvBold.visibility = View.VISIBLE
            }
            tvFontName.text = item.nameFont
            tvFontName.typeface = ResourcesCompat.getFont(context, item.fontRes[1])
        }
    }
}
