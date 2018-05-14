package com.thekhaeng.materialstyletemplate.tab.subtab.component

import android.os.Bundle
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.base.BaseRecyclerFragment
import kotlinx.android.synthetic.main.fragment_recycler_view.fragment_recycler_view as recyclerView

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */
class ComponentFragment : BaseRecyclerFragment() {

    companion object {
        fun newInstance(): ComponentFragment {
            val fragment = ComponentFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override
    fun setupItem(): List<BaseItem> = ComponentItemCreator.createItem(context)

}