package com.thekhaeng.materialstyletemplate.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_CODE_VIEW
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_COLOR_PALETTE
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_DESCRIPTION
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_DIVIDER
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_ELEVATION
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_FOOTER
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_ICON_BUTTON
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_INFLATE_VIEW
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_SPACE
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_TEXT
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_TOPIC
import com.thekhaeng.materialstyletemplate.adapter.ItemConstant.TYPE_WEIGHT_TEXT
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.holder.*
import com.thekhaeng.materialstyletemplate.adapter.item.*

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

class MaterialItemAdapter(private val itemList: List<BaseItem>?)
    : RecyclerView.Adapter<BaseViewHolder>() {

    override
    fun getItemCount(): Int {
        return itemList?.size ?: 0
    }

    override
    fun getItemViewType(position: Int): Int {
        return itemList?.get(position)?.type ?: 0
    }

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        when (viewType) {
            TYPE_TOPIC -> return TopicHolder(parent)
            TYPE_DESCRIPTION -> return DescriptionHolder(parent)
            TYPE_COLOR_PALETTE -> return ColorPaletteHolder(parent)
            TYPE_ICON_BUTTON -> return IconButtonHolder(parent)
            TYPE_TEXT -> return TextHolder(parent)
            TYPE_WEIGHT_TEXT -> return TextWeightHolder(parent)
            TYPE_ELEVATION -> return ElevationHolder(parent)
            TYPE_FOOTER -> return FooterHolder(parent)
            TYPE_DIVIDER -> return DividerHolder(parent)
            TYPE_SPACE -> return SpaceHolder(parent)
            TYPE_INFLATE_VIEW -> return InflateViewHolder(parent)
            TYPE_CODE_VIEW -> return CodeViewHolder(parent)
        }
        throw NullPointerException()
    }

    override
    fun onBindViewHolder(viewHolder: BaseViewHolder, position: Int) {
        val baseItem = itemList!![position]
        val type = getItemViewType(position)

        when (type) {
            TYPE_TOPIC -> {
                val holder = viewHolder as TopicHolder
                val item = baseItem as TopicItem
                holder.onBind(item)
            }
            TYPE_DESCRIPTION -> {
                val holder = viewHolder as DescriptionHolder
                val item = baseItem as DescriptionItem
                holder.onBind(item)
            }
            TYPE_COLOR_PALETTE -> {
                val holder = viewHolder as ColorPaletteHolder
                val item = baseItem as ColorItem
                holder.onBind(item)
            }
            TYPE_ICON_BUTTON -> {
                val holder = viewHolder as IconButtonHolder
                val item = baseItem as IconButtonItem
                holder.onBind(item)
            }
            TYPE_TEXT -> {
                val holder = viewHolder as TextHolder
                val item = baseItem as TextItem
                holder.onBind(item)
            }
            TYPE_WEIGHT_TEXT -> {
                val holder = viewHolder as TextWeightHolder
                val item = baseItem as TextWeightItem
                holder.onBind(item)
            }
            TYPE_ELEVATION -> {
                val holder = viewHolder as ElevationHolder
                val item = baseItem as ElevationItem
                holder.onBind(item)
            }
            TYPE_FOOTER -> {
                val holder = viewHolder as FooterHolder
                val item = baseItem as FooterItem
                holder.onBind(item)
            }
            TYPE_DIVIDER ->{
                val holder = viewHolder as DividerHolder
                val item = baseItem as DividerItem
                holder.onBind(item)
            }
            TYPE_SPACE ->{
                val holder = viewHolder as SpaceHolder
                val item = baseItem as SpaceItem
                holder.onBind(item)
            }
            TYPE_INFLATE_VIEW ->{
                val holder = viewHolder as InflateViewHolder
                val item = baseItem as InflateViewItem
                holder.onBind(item)
            }
            TYPE_CODE_VIEW ->{
                val holder = viewHolder as CodeViewHolder
                val item = baseItem as CodeViewItem
                holder.onBind(item)
            }
        }
    }

}
