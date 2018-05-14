package com.thekhaeng.materialstyletemplate.adapter.holder

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.IconButtonItem
import kotlinx.android.synthetic.main.holder_icons_button.view.holder_icon_button as btnIcon


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class IconButtonHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_icons_button) {


    @SuppressLint("SetTextI18n")
    fun onBind(item: IconButtonItem) {
        itemView.apply {
            btnIcon.setOnClickListener {
                openDefaultWebBrowser("https://material.io/tools/icons/?icon=pets&style=baseline")
            }
        }
    }

    private fun openDefaultWebBrowser(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }
    }
}
