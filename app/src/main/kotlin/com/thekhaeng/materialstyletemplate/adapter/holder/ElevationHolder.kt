package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.ViewGroup
import android.widget.FrameLayout
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.ElevationItem
import kotlinx.android.synthetic.main.holder_elevation.view.holder_elevation_card as cardView
import kotlinx.android.synthetic.main.holder_elevation.view.holder_elevation_card_container as container
import kotlinx.android.synthetic.main.holder_elevation.view.holder_elevation_tv_name as tvName

/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class ElevationHolder(viewGroup: ViewGroup)
    : BaseViewHolder(viewGroup, R.layout.holder_elevation) {

    fun onBind(item: ElevationItem) {
        itemView.apply {
            cardView.layoutParams = (cardView.layoutParams as FrameLayout.LayoutParams).apply {
                width = item.width
                height = item.height
                gravity = item.gravity
                setMargins(
                        item.marginStart,
                        item.marginTop,
                        item.marginEnd,
                        item.marginBottom)
            }

            cardView.radius = item.corner
            cardView.cardElevation = context.resources.getDimension(item.elevationRes)
            tvName.text = item.name

        }
    }
}
