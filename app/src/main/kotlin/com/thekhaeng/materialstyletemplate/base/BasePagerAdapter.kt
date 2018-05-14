package com.thekhaeng.materialstyletemplate.base

import android.content.Context
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by「 The Khaeng 」on 10 May 2018 :)
 */
abstract class BasePagerAdapter : FragmentStatePagerAdapter {

    val fragmentList: Array<Fragment?> = arrayOfNulls(count)
    var context: Context? = null
        private set

    constructor(activity: FragmentActivity) : super(activity.supportFragmentManager) {
        this.context = activity
    }

    constructor(fragment: Fragment) : super(fragment.childFragmentManager) {
        this.context = fragment.context
    }

    override
    fun instantiateItem(container: ViewGroup, position: Int): Any {
        val fragment = super.instantiateItem(container, position) as Fragment
        fragmentList[position] = fragment
        return fragment
    }


    override
    fun getItem(position: Int): Fragment? {
        if (fragmentList[position] == null) {
            fragmentList[position] = getNewFragmentItem(position, fragmentList)
        }
        return fragmentList[position]
    }

    abstract fun getNewFragmentItem(position: Int, fragmentList: Array<Fragment?>): Fragment?

}