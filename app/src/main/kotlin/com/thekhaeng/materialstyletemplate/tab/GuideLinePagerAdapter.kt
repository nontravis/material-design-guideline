package com.thekhaeng.materialstyletemplate.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.base.BasePagerAdapter
import com.thekhaeng.materialstyletemplate.tab.subtab.component.ComponentFragment

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */

class GuideLinePagerAdapter : BasePagerAdapter {

    companion object {
        const val COMPONENT_INDEX = 0
    }

    constructor(activity: FragmentActivity) : super(activity)

    constructor(fragment: Fragment) : super(fragment)


    override
    fun getCount(): Int = 1

    override
    fun getNewFragmentItem(position: Int, fragmentList: Array<Fragment?>): Fragment? {
        return when (position) {
            COMPONENT_INDEX -> {
                ComponentFragment.newInstance()
            }
            else -> throw RuntimeException()
        }
    }

    override
    fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            COMPONENT_INDEX -> {
                context?.getString(R.string.component)
            }
            else -> throw RuntimeException()
        }
    }

}