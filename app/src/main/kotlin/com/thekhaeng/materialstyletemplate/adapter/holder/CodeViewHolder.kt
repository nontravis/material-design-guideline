package com.thekhaeng.materialstyletemplate.adapter.holder

import android.view.ViewGroup
import com.thekhaeng.materialstyletemplate.R
import com.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder
import com.thekhaeng.materialstyletemplate.adapter.item.CodeViewItem
import kotlinx.android.synthetic.main.holder_code_view.view.coding_view as codeView


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

class CodeViewHolder(viewGroup: ViewGroup) : BaseViewHolder(viewGroup, R.layout.holder_code_view) {


    fun onBind(item: CodeViewItem) {
        itemView.apply {
            codeView.text = item.code
        }
    }
}
