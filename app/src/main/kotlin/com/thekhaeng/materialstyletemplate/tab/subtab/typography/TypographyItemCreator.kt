package com.thekhaeng.materialstyletemplate.tab.subtab.typography

import android.content.Context
import com.thekhaeng.materialdesign.color.MaterialColor
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.adapter.item.*
import java.util.*

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

object TypographyItemCreator {

    fun createItem(context: Context?): List<BaseItem> {
        val items = ArrayList<BaseItem>()
        items.add(TopicItem("The type system", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Use typography to present your design and content as clearly and efficiently as possible."))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Font Weight", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Weight refers to the relative thickness of a font’s stroke. A typeface can come in many weights; and four to six weights is a typical number available for a typeface."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(TextWeightItem(
                listOf(R.font.font_roboto_light,
                        R.font.font_roboto,
                        R.font.font_roboto_medium,
                        R.font.font_roboto),
                "Roboto.ttf"))


        items.add(TextWeightItem(
                listOf(R.font.font_roboto_mono_light,
                        R.font.font_roboto_mono,
                        R.font.font_roboto_mono_medium,
                        R.font.font_roboto_mono),
                "Roboto Mono.ttf"))

        items.add(TextWeightItem(
                listOf(R.font.font_raleway_light,
                        R.font.font_raleway,
                        R.font.font_raleway_semibold,
                        R.font.font_raleway),
                "Raleway.ttf"))

        items.add(TextWeightItem(
                listOf(0,
                        R.font.font_product_sans,
                        0,
                        R.font.font_product_sans),
                "Product Sans.ttf"))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Type Scale ", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("The type scale is a combination of 12 styles that are supported by the type system. It contains reusable categories of text, each with an intended application and meaning."))
        items.add(TextItem())

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Tabular", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Use tabular figures (also known as monospaced numbers), rather than proportional digits, in tables or places where values may change often."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(InflateViewItem(R.layout.inflate_view_tabular))

        items.add(DividerItem(
                marginTop = context?.resources?.getDimension(R.dimen.margin_top_title),
                marginBottom = context?.resources?.getDimension(R.dimen.margin_top_title) ))

        items.add(TopicItem("Space", MaterialColor.TEXT_COLOR_ACTIVE_LIGHT_THEME))
        items.add(DescriptionItem("Keep paragraph spacing in the range between .75x and 1.25x of the type size."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(InflateViewItem(R.layout.inflate_view_space))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(DescriptionItem("TextSpace.kt extension provides text space functions."))
        items.add(SpaceItem(context?.resources?.getDimension(R.dimen.text_space_margin_body_paragraph)))
        items.add(CodeViewItem("" +
                "[Kotlin]\n" +
                "textView.setLineHeight(float)\n" +
                "textView.scaleLineSpaceByTextSize(scale)\n" +
                "\n" +
                "[Java]\n" +
                "TextSpace.setLineHeight(textView,float);\n" +
                "TextSpace.scaleLineSpaceByTextSize(textView, scale);)" ))


        items.add(FooterItem())
        return items
    }
}
