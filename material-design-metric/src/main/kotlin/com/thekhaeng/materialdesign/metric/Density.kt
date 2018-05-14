@file:JvmName("Density")

package com.thekhaeng.materialdesign.metric

import android.content.res.Resources
import android.util.TypedValue

/**
 * Created by The Khaeng on 09 May 2018 :)
 */


fun spToPx(sp: Float): Float =
        TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP,
                sp,
                Resources.getSystem().displayMetrics)

fun spToPx(px: Int): Float = spToPx(px.toFloat())
fun spToPxInt(sp: Float): Int = Math.round(spToPx(sp))
fun spToPxInt(sp: Int): Int = Math.round(spToPx(sp))


fun dpToPx(dp: Float): Float = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp,
        Resources.getSystem().displayMetrics)

fun dpToPx(px: Int): Float = dpToPx(px.toFloat())
fun dpToPxInt(dp: Float): Int = Math.round(dpToPx(dp))
fun dpToPxInt(dp: Int): Int = Math.round(dpToPx(dp))


fun pxToDp(px: Float): Float = px / Resources.getSystem().displayMetrics.density
fun pxToDp(px: Int): Float = pxToDp(px.toFloat())
fun pxToDpInt(px: Float): Int = Math.round(pxToDp(px))
fun pxToDpInt(px: Int): Int = Math.round(pxToDp(px))

fun pxToSp(px: Float): Float = px / Resources.getSystem().displayMetrics.scaledDensity
fun pxToSp(px: Int): Float = pxToSp(px.toFloat())
fun pxToSpInt(px: Float): Int = Math.round(pxToSp(px))
fun pxToSpInt(px: Int): Int = Math.round(pxToSp(px))


