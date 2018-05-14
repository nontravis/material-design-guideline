package com.thekhaeng.materialstyletemplate.tab.subtab.icon

import android.os.Bundle
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.base.BaseRecyclerFragment
import com.thekhaeng.materialstyletemplate.tab.subtab.icon.IconItemCreator
import kotlinx.android.synthetic.main.fragment_recycler_view.fragment_recycler_view as recyclerView

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */
class IconFragment : BaseRecyclerFragment() {

    companion object {
        fun newInstance(): IconFragment {
            val fragment = IconFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override
    fun setupItem(): List<BaseItem> = IconItemCreator.createItem(context)


}