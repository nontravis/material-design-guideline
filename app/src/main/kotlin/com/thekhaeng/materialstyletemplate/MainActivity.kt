package com.thekhaeng.materialstyletemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.appbar.AppBarLayout
import com.thekhaeng.materialstyletemplate.TabPagerAdapter
import com.thekhaeng.materialstyletemplate.tab.State
import kotlinx.android.synthetic.main.activity_main.main_appbar as appbar
import kotlinx.android.synthetic.main.activity_main.main_tab as tabLayout
import kotlinx.android.synthetic.main.activity_main.main_view_pager as vpTab


class MainActivity : AppCompatActivity() {

    private lateinit var tabPagerAdapter: TabPagerAdapter

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabPagerAdapter = TabPagerAdapter(this)

        setupAppbar()
        setupViewPager()
        setupTabLayout()

    }

    private fun setupAppbar() {
        appbar?.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            when {
                verticalOffset == 0 ->
                    tabPagerAdapter.updateAppbarStateToFragment(vpTab.currentItem, State.EXPANDED)
                Math.abs(verticalOffset) >= appBarLayout.totalScrollRange ->
                    tabPagerAdapter.updateAppbarStateToFragment(vpTab.currentItem, State.COLLAPSED)
                else ->
                    tabPagerAdapter.updateAppbarStateToFragment(vpTab.currentItem, State.IDLE)
            }
        })
    }


    private fun setupViewPager() {
        vpTab?.adapter = tabPagerAdapter
        vpTab?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override
            fun onPageScrollStateChanged(state: Int) {
            }

            override
            fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override
            fun onPageSelected(position: Int) {
                tabPagerAdapter.updateAppbarStateToFragment(position)
            }

        })
        vpTab?.disableSwipe(true)
    }

    private fun setupTabLayout() {
        tabLayout?.apply {
            setupWithViewPager(vpTab)
        }
    }


}
