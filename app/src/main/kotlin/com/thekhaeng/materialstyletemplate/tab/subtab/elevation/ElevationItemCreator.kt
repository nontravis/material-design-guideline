package com.thekhaeng.materialstyletemplate.tab.subtab.elevation

import android.content.Context
import com.thekhaeng.materialdesign.color.MaterialColor
import com.thekhaeng.materialdesign.metric.dpToPx
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.adapter.item.*


/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

object ElevationItemCreator {

    fun createItem(context: Context?): List<BaseItem> {
        val items = ArrayList<BaseItem>()
        items.add(TopicItem("Elevation", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Elevation is the relative distance between two surfaces along the z-axis."))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Default elevations", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("The following table lists default values for resting elevation and dynamic elevation offsets."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))

        items.add(ElevationItem(
                height = dpToPx(150).toInt(),
                width = dpToPx(250).toInt(),
                marginTop = dpToPx(20).toInt(),
                marginBottom = dpToPx(32).toInt(),
                elevationRes = R.dimen.md_elevation_dialog,
                name = "Dialog\n\n24dp"))
        items.add(DividerItem(dpToPx(16).toInt()))
        items.add(ElevationItem(
                height = dpToPx(200).toInt(),
                width = dpToPx(250).toInt(),
                marginTop = dpToPx(20).toInt(),
                marginBottom = dpToPx(32).toInt(),
                elevationRes = R.dimen.md_elevation_navigation_drawer,
                name = "Navigation drawer\nModal bottom sheet\nModal side sheet\n\n16dp"))
        items.add(DividerItem(dpToPx(16).toInt()))
        items.add(ElevationItem(
                height = dpToPx(300).toInt(),
                width = dpToPx(350).toInt(),
                elevationRes = R.dimen.md_elevation_bottom_sheet_standard,
                marginTop = dpToPx(20).toInt(),
                marginBottom = dpToPx(32).toInt(),
                name = "Standard bottom sheet\n" +
                        "Standard side sheet\n" +
                        "Bottom navigation bar\n" +
                        "Bottom app bar\n" +
                        "Menus and sub menus\n" +
                        "Card (when picked up)\n" +
                        "Contained button (pressed state)\n\n" +
                        "8dp"))
        items.add(DividerItem(dpToPx(16).toInt()))
        items.add(ElevationItem(
                height = dpToPx(150).toInt(),
                width = dpToPx(250).toInt(),
                elevationRes = R.dimen.material_elevation_top_app_bar,
                marginTop = dpToPx(20).toInt(),
                marginBottom = dpToPx(32).toInt(),
                name = "Top app bar\n\n4dp"))
        items.add(DividerItem(dpToPx(16).toInt()))
        items.add(ElevationItem(
                height = dpToPx(150).toInt(),
                width = dpToPx(250).toInt(),
                elevationRes = R.dimen.material_elevation_button,
                marginTop = dpToPx(20).toInt(),
                marginBottom = dpToPx(32).toInt(),
                name = "Contained button\n\n2dp"))
        items.add(DividerItem(dpToPx(16).toInt()))
        items.add(ElevationItem(
                height = dpToPx(170).toInt(),
                width = dpToPx(250).toInt(),
                elevationRes = R.dimen.material_elevation_card,
                marginTop = dpToPx(20).toInt(),
                marginBottom = dpToPx(32).toInt(),
                name = "Search bar\nCard\nSwitch\n\n1dp"))


        items.add(FooterItem())
        return items
    }
}
