package com.thekhaeng.materialstyletemplate.tab.subtab.typography

import android.os.Bundle
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.base.BaseRecyclerFragment
import com.thekhaeng.materialstyletemplate.tab.subtab.typography.TypographyItemCreator
import kotlinx.android.synthetic.main.fragment_recycler_view.fragment_recycler_view as recyclerView

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */
class TypographyFragment : BaseRecyclerFragment() {

    companion object {
        fun newInstance(): TypographyFragment {
            val fragment = TypographyFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override
    fun setupItem(): List<BaseItem> = TypographyItemCreator.createItem(context)

}