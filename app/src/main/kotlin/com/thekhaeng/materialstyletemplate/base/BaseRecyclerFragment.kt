package com.thekhaeng.materialstyletemplate.base

import android.os.Bundle
import com.thekhaeng.materialstyletemplate.base.BaseFragment
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.MaterialItemAdapter
import com.thekhaeng.materialstyletemplate.adapter.base.BaseItem
import com.thekhaeng.materialstyletemplate.widgets.PreCachingLayoutManager
import kotlinx.android.synthetic.main.fragment_recycler_view.fragment_recycler_view as recyclerView

/**
 * Created by「 The Khaeng 」on 02 Oct 2017 :)
 */

abstract class BaseRecyclerFragment
    : BaseFragment() {

    lateinit var adapter: MaterialItemAdapter

    override
    fun onInitialize(savedInstanceState: Bundle?) {
        super.onInitialize(savedInstanceState)
        adapter = MaterialItemAdapter(setupItem())
    }

    override
    fun setupLayoutView(): Int = R.layout.fragment_recycler_view

    override
    fun onSetupView(savedInstanceState: Bundle?) {
        super.onSetupView(savedInstanceState)
        recyclerView?.apply {
            setItemViewCacheSize(30)
            layoutManager = PreCachingLayoutManager(context)
            adapter = this@BaseRecyclerFragment.adapter
        }
    }


    abstract fun setupItem(): List<BaseItem>

}
