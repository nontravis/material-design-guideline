package com.thekhaeng.materialstyletemplate

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.thekhaeng.materialstyletemplate.base.BasePagerAdapter
import com.thekhaeng.materialstyletemplate.tab.*

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */

class TabPagerAdapter : BasePagerAdapter {

    companion object {
        const val FOUNDATION_INDEX = 0
        const val GUIDE_LINE_INDEX = 1
    }

    @AppbarState
    var appbarStart: Int = State.IDLE

    constructor(activity: FragmentActivity) : super(activity)

    constructor(fragment: Fragment) : super(fragment)


    override
    fun getCount(): Int = 2

    override
    fun getNewFragmentItem(position: Int, fragmentList: Array<Fragment?>): Fragment? {
        return when (position) {
            FOUNDATION_INDEX -> {
                FoundationFragment.newInstance()
            }
            GUIDE_LINE_INDEX -> {
                GuideLineFragment.newInstance()
            }
            else -> throw RuntimeException()
        }
    }

    override
    fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            FOUNDATION_INDEX -> {
                context?.getString(R.string.foundation)
            }
            GUIDE_LINE_INDEX -> {
                context?.getString(R.string.guildlines)
            }
            else -> throw RuntimeException()
        }
    }

    fun updateAppbarStateToFragment(index: Int, @AppbarState state: Int = -1) {
        if (state != -1) {
            appbarStart = state
        }
        val fragment = fragmentList[index]
        if (fragment != null && fragment is OnAppbarChangeStateListener) {
            fragment.onChangeState(appbarStart)
        }
    }


}