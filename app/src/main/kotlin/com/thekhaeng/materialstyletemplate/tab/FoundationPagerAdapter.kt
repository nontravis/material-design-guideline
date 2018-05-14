package com.thekhaeng.materialstyletemplate.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.base.BasePagerAdapter
import com.thekhaeng.materialstyletemplate.tab.subtab.color.ColorFragment
import com.thekhaeng.materialstyletemplate.tab.subtab.elevation.ElevationFragment
import com.thekhaeng.materialstyletemplate.tab.subtab.icon.IconFragment
import com.thekhaeng.materialstyletemplate.tab.subtab.layout.LayoutFragment
import com.thekhaeng.materialstyletemplate.tab.subtab.typography.TypographyFragment

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */

class FoundationPagerAdapter : BasePagerAdapter {

    companion object {
        const val COLOR_INDEX = 0
        const val ELEVATION_INDEX = 1
        const val LAYOUT_INDEX = 2
        const val TYPOGRAPHY_INDEX = 3
        const val ICON_INDEX = 4
    }

    constructor(activity: FragmentActivity) : super(activity)

    constructor(fragment: Fragment) : super(fragment)


    override
    fun getCount(): Int = 5

    override
    fun getNewFragmentItem(position: Int, fragmentList: Array<Fragment?>): Fragment? {
        return when (position) {
            COLOR_INDEX -> {
                ColorFragment.newInstance()
            }
            ELEVATION_INDEX -> {
                ElevationFragment.newInstance()
            }
            LAYOUT_INDEX -> {
                LayoutFragment.newInstance()
            }
            TYPOGRAPHY_INDEX -> {
                TypographyFragment.newInstance()
            }
            ICON_INDEX -> {
                IconFragment.newInstance()
            }
            else -> throw RuntimeException()
        }
    }

    override
    fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            COLOR_INDEX -> {
                context?.getString(R.string.color)
            }
            ELEVATION_INDEX -> {
                context?.getString(R.string.elevation)
            }
            LAYOUT_INDEX -> {
                context?.getString(R.string.layout)
            }
            TYPOGRAPHY_INDEX -> {
                context?.getString(R.string.typography)
            }
            ICON_INDEX -> {
                context?.getString(R.string.icon)
            }
            else -> throw RuntimeException()
        }
    }

}