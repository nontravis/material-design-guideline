package com.thekhaeng.materialstyletemplate.tab

import android.os.Bundle
import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_tab_foundation.foundation_appbar as appbar
import kotlinx.android.synthetic.main.fragment_tab_foundation.foundation_tab_layout as tabLayout
import kotlinx.android.synthetic.main.fragment_tab_foundation.foundation_view_pager as vpSubTab


/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */
class FoundationFragment : BaseFragment(), OnAppbarChangeStateListener {

    companion object {
        fun newInstance(): FoundationFragment {
            val fragment = FoundationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var subTabAdapter: FoundationPagerAdapter

    override
    fun setupLayoutView(): Int = R.layout.fragment_tab_foundation


    override
    fun onInitialize(savedInstanceState: Bundle?) {
        super.onInitialize(savedInstanceState)
        subTabAdapter = FoundationPagerAdapter(this)
    }

    override
    fun onSetupView(savedInstanceState: Bundle?) {
        super.onSetupView(savedInstanceState)
        vpSubTab?.adapter = subTabAdapter
        tabLayout.setupWithViewPager(vpSubTab)

        if(tabLayout.tabCount > 0){
            val tab = (tabLayout.getChildAt(0) as ViewGroup).getChildAt(0)
            val p = tab.layoutParams as ViewGroup.MarginLayoutParams
            p.setMargins(resources.getDimension(R.dimen.default_padding_margin_xx).toInt(), 0, 0 , 0)
            tab.requestLayout()
        }

    }

    override
    fun onChangeState(state: Int) {
        when (state) {
            State.COLLAPSED -> {
                animationElevationUp(
                        appbar,
                        resources.getDimension(R.dimen.material_elevation_top_app_bar_scrolled_state))
            }
            State.EXPANDED -> {
                animationElevationDown(appbar)
            }
        }
    }

}