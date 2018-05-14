package com.thekhaeng.materialstyletemplate.adapter.holder

import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.FooterItem
import kotlinx.android.synthetic.main.holder_footer.view.footer_img_profile as imgProfile
import kotlinx.android.synthetic.main.holder_footer.view.footer_tv_github as tvGithub
import kotlinx.android.synthetic.main.holder_footer.view.footer_tv_section_2_item_1 as tvItem1
import kotlinx.android.synthetic.main.holder_footer.view.footer_tv_section_2_item_2 as tvItem2
import kotlinx.android.synthetic.main.holder_footer.view.footer_tv_section_2_item_3 as tvItem3
import kotlinx.android.synthetic.main.holder_footer.view.footer_tv_sub_title as tvSubTitle


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class FooterHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_footer) {

    fun onBind(item: FooterItem) {
        itemView.apply {
            imgProfile.setOnClickListener {
                openDefaultWebBrowser("https://www.facebook.com/thekhaeng.io")
            }
            tvSubTitle.setOnClickListener {
                openDefaultWebBrowser("https://www.facebook.com/thekhaeng.io")
            }
            tvGithub.setOnClickListener {
                openDefaultWebBrowser("https://github.com/TheKhaeng/material-design-guideline")
            }
            tvItem1.setOnClickListener {
                openDefaultWebBrowser("https://www.facebook.com/thekhaeng.io")
            }
            tvItem2.setOnClickListener {
                openDefaultWebBrowser("https://medium.com/@Nonthawit")
            }
            tvItem3.setOnClickListener {
                openDefaultEmail("nonthawit.thekhaeng@gmail.com")
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

    private fun openDefaultEmail(email: String) {
        val intent = Intent(Intent.ACTION_SENDTO,
                Uri.fromParts(
                        "mailto", email, null))
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }
    }
}
