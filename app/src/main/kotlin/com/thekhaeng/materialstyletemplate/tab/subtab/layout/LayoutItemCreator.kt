package com.thekhaeng.materialstyletemplate.tab.subtab.layout

import android.content.Context
import com.thekhaeng.materialdesign.color.MaterialColor
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.adapter.item.*


/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

object LayoutItemCreator {

    fun createItem(context: Context?): List<BaseItem> {
        val items = ArrayList<BaseItem>()
        items.add(TopicItem("Understanding layout ", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Material Design layouts encourage consistency across platforms, environments, and screen sizes by using uniform elements and spacing."))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Structure", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("" +
                "normal size start at `8dp` (`R.dimen.default_padding_margin`)\n" +
                "huge size start at `48dp` (`R.dimen.default_padding_margin_huge`)\n" +
                "\n" +
                "x = +8dp\n" +
                "\n" +
                "h = +4dp\n" +
                "\n" +
                "example:\nxxx = 8 x 3dp = 24dp, xxxh = (8 x 3dp) + 4dp = 28dp"))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(CodeViewItem(
                "|DIMEN NAMES                     | VALUE |\n" +
                "| ------------------------------ | -----:|\n" +
                "|**Normal**                      |       |\n" +
                "|default_padding_margin_small_x  |  2dp  |\n" +
                "|default_padding_margin_small    |  4dp  |\n" +
                "|default_padding_margin          |  8dp  |\n" +
                "|default_padding_margin_h        | 12dp  |\n" +
                "|default_padding_margin_x        | 16dp  |\n" +
                "|default_padding_margin_xh       | 20dp  |\n" +
                "|default_padding_margin_xx       | 24dp  |\n" +
                "|default_padding_margin_xxh      | 28dp  |\n" +
                "|default_padding_margin_xxx      | 32dp  |\n" +
                "|default_padding_margin_xxxh     | 36dp  |\n" +
                "|default_padding_margin_xxxx     | 40dp  |\n" +
                "|default_padding_margin_xxxxh    | 44dp  |\n" +
                "|**Huge**                        |       |\n" +
                "|default_padding_margin_huge     | 48dp  |\n" +
                "|default_padding_margin_huge_x   | 56dp  |\n" +
                "|default_padding_margin_huge_xh  | 60dp  |\n" +
                "|default_padding_margin_huge_xx  | 64dp  |\n" +
                "|default_padding_margin_huge_xxh | 68dp  |\n" +
                "|default_padding_margin_huge_xxx | 72dp  |\n" +
                "|default_padding_margin_huge_xxxh| 76dp  |\n" +
                "|default_padding_margin_huge_xxxx| 80dp  |"))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Pixel density", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Density utility class provides density converter functions."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(CodeViewItem("" +
                "[Kotlin]\n"+
                "dpToPx(dp)\n" +
                "pxToDp(px)\n" +
                "spToPx(sp)\n" +
                "pxToSp(px)\n\n"+
                "[Java]\n"+
                "Density.dpToPx(dp)\n" +
                "Density.pxToDp(px)\n" +
                "Density.spToPx(sp)\n" +
                "Density.pxToSp(px)" ))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Touch and click targets ", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Touch targets apply to any device that receives both touch and non-touch input. To balance information density and usability, touch targets should be at least 48 x 48 dp, with at least 8dp of space between each target."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(InflateViewItem(R.layout.inflate_view_touch_target))



        items.add(FooterItem())
        return items
    }
}
