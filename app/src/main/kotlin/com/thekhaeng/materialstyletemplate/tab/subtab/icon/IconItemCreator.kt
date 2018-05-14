package com.thekhaeng.materialstyletemplate.tab.subtab.icon

import android.content.Context
import com.thekhaeng.materialdesign.color.MaterialColor
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.adapter.item.DescriptionItem
import com.thekhaeng.materialstyletemplate.adapter.item.FooterItem
import com.thekhaeng.materialstyletemplate.adapter.item.IconButtonItem
import com.thekhaeng.materialstyletemplate.adapter.item.TopicItem


/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

object IconItemCreator {

    fun createItem(context: Context?): List<BaseItem> {
        val items = ArrayList<BaseItem>()
        items.add(TopicItem("Icons", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Material icons are delightful, beautifully crafted symbols for common actions and items. Download on desktop to use them in your digital products for Android, iOS, and web."))
        items.add(IconButtonItem())
        items.add(FooterItem())
        return items
    }
}
