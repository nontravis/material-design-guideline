package com.thekhaeng.materialstyletemplate.tab.subtab.layout

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.base.BaseRecyclerFragment
import kotlinx.android.synthetic.main.fragment_recycler_view.fragment_recycler_view as recyclerView

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */
class LayoutFragment : BaseRecyclerFragment() {

    companion object {
        fun newInstance(): LayoutFragment {
            val fragment = LayoutFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override
    fun setupItem(): List<BaseItem> = LayoutItemCreator.createItem(context)


}