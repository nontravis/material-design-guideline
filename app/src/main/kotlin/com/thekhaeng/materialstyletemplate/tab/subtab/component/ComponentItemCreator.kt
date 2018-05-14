package com.thekhaeng.materialstyletemplate.tab.subtab.component

import android.content.Context
import com.thekhaeng.materialdesign.color.MaterialColor
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.adapter.item.*
import java.util.*

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

object ComponentItemCreator {

    fun createItem(context: Context?): List<BaseItem> {
        val items = ArrayList<BaseItem>()
        items.add(TopicItem("Component", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.margin_top_title)))
        items.add(InflateViewItem(R.layout.inflate_view_button))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))
        items.add(InflateViewItem(R.layout.inflate_view_text_field))

        items.add(FooterItem())
        return items
    }
}
