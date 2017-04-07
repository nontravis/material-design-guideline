package th.co.thekhaeng.materialstyletemplate.adapter;

import android.support.annotation.ColorInt;

import java.util.ArrayList;
import java.util.List;

import th.co.thekhaeng.materialstyletemplate.R;
import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.ColorItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.ElevationItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.IconItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.KeylinesItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.TextItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.TopicItem;
import th.co.thekhaeng.materialstyletemplate.library.MaterialColor;

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

public class ItemCreator{

    public static final int TYPE_TOPIC = 0;
    public static final int TYPE_COLOR_PALETTE = 1;
    public static final int TYPE_ICON = 2;
    public static final int TYPE_TEXT = 3;
    public static final int TYPE_KEYLINES = 4;
    public static final int TYPE_ELEVATION = 5;

    public static List<BaseItem> createItem(){
        List<BaseItem> items = new ArrayList<>();
        items.add( createTopicItem( "Color palette", MaterialColor.TEAL_500 ) );
        items.add( createColorItem(
                new int[]{R.color.md_red50,
                        R.color.md_red100,
                        R.color.md_red200,
                        R.color.md_red300,
                        R.color.md_red400,
                        R.color.md_red500,
                        R.color.md_red600,
                        R.color.md_red700,
                        R.color.md_red800,
                        R.color.md_red900,
                        R.color.md_redA100,
                        R.color.md_redA200,
                        R.color.md_redA400,
                        R.color.md_redA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_pink50,
                        R.color.md_pink100,
                        R.color.md_pink200,
                        R.color.md_pink300,
                        R.color.md_pink400,
                        R.color.md_pink500,
                        R.color.md_pink600,
                        R.color.md_pink700,
                        R.color.md_pink800,
                        R.color.md_pink900,
                        R.color.md_pinkA100,
                        R.color.md_pinkA200,
                        R.color.md_pinkA400,
                        R.color.md_pinkA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_purple50,
                        R.color.md_purple100,
                        R.color.md_purple200,
                        R.color.md_purple300,
                        R.color.md_purple400,
                        R.color.md_purple500,
                        R.color.md_purple600,
                        R.color.md_purple700,
                        R.color.md_purple800,
                        R.color.md_purple900,
                        R.color.md_purpleA100,
                        R.color.md_purpleA200,
                        R.color.md_purpleA400,
                        R.color.md_purpleA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_deeppurple50,
                        R.color.md_deeppurple100,
                        R.color.md_deeppurple200,
                        R.color.md_deeppurple300,
                        R.color.md_deeppurple400,
                        R.color.md_deeppurple500,
                        R.color.md_deeppurple600,
                        R.color.md_deeppurple700,
                        R.color.md_deeppurple800,
                        R.color.md_deeppurple900,
                        R.color.md_deeppurpleA100,
                        R.color.md_deeppurpleA200,
                        R.color.md_deeppurpleA400,
                        R.color.md_deeppurpleA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_indigo50,
                        R.color.md_indigo100,
                        R.color.md_indigo200,
                        R.color.md_indigo300,
                        R.color.md_indigo400,
                        R.color.md_indigo500,
                        R.color.md_indigo600,
                        R.color.md_indigo700,
                        R.color.md_indigo800,
                        R.color.md_indigo900,
                        R.color.md_indigoA100,
                        R.color.md_indigoA200,
                        R.color.md_indigoA400,
                        R.color.md_indigoA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_blue50,
                        R.color.md_blue100,
                        R.color.md_blue200,
                        R.color.md_blue300,
                        R.color.md_blue400,
                        R.color.md_blue500,
                        R.color.md_blue600,
                        R.color.md_blue700,
                        R.color.md_blue800,
                        R.color.md_blue900,
                        R.color.md_blueA100,
                        R.color.md_blueA200,
                        R.color.md_blueA400,
                        R.color.md_blueA700
                } ) );

        items.add( createColorItem(
                new int[]{
                        R.color.md_lightblue50,
                        R.color.md_lightblue100,
                        R.color.md_lightblue200,
                        R.color.md_lightblue300,
                        R.color.md_lightblue400,
                        R.color.md_lightblue500,
                        R.color.md_lightblue600,
                        R.color.md_lightblue700,
                        R.color.md_lightblue800,
                        R.color.md_lightblue900,
                        R.color.md_lightblueA100,
                        R.color.md_lightblueA200,
                        R.color.md_lightblueA400,
                        R.color.md_lightblueA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_cyan50,
                        R.color.md_cyan100,
                        R.color.md_cyan200,
                        R.color.md_cyan300,
                        R.color.md_cyan400,
                        R.color.md_cyan500,
                        R.color.md_cyan600,
                        R.color.md_cyan700,
                        R.color.md_cyan800,
                        R.color.md_cyan900,
                        R.color.md_cyanA100,
                        R.color.md_cyanA200,
                        R.color.md_cyanA400,
                        R.color.md_cyanA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_lightblue50,
                        R.color.md_lightblue100,
                        R.color.md_lightblue200,
                        R.color.md_lightblue300,
                        R.color.md_lightblue400,
                        R.color.md_lightblue500,
                        R.color.md_lightblue600,
                        R.color.md_lightblue700,
                        R.color.md_lightblue800,
                        R.color.md_lightblue900,
                        R.color.md_lightblueA100,
                        R.color.md_lightblueA200,
                        R.color.md_lightblueA400,
                        R.color.md_lightblueA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_teal50,
                        R.color.md_teal100,
                        R.color.md_teal200,
                        R.color.md_teal300,
                        R.color.md_teal400,
                        R.color.md_teal500,
                        R.color.md_teal600,
                        R.color.md_teal700,
                        R.color.md_teal800,
                        R.color.md_teal900,
                        R.color.md_tealA100,
                        R.color.md_tealA200,
                        R.color.md_tealA400,
                        R.color.md_tealA700
                } ) );

        items.add( createColorItem(
                new int[]{
                        R.color.md_green50,
                        R.color.md_green100,
                        R.color.md_green200,
                        R.color.md_green300,
                        R.color.md_green400,
                        R.color.md_green500,
                        R.color.md_green600,
                        R.color.md_green700,
                        R.color.md_green800,
                        R.color.md_green900,
                        R.color.md_greenA100,
                        R.color.md_greenA200,
                        R.color.md_greenA400,
                        R.color.md_greenA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_lightgreen50,
                        R.color.md_lightgreen100,
                        R.color.md_lightgreen200,
                        R.color.md_lightgreen300,
                        R.color.md_lightgreen400,
                        R.color.md_lightgreen500,
                        R.color.md_lightgreen600,
                        R.color.md_lightgreen700,
                        R.color.md_lightgreen800,
                        R.color.md_lightgreen900,
                        R.color.md_lightgreenA100,
                        R.color.md_lightgreenA200,
                        R.color.md_lightgreenA400,
                        R.color.md_lightgreenA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_lime50,
                        R.color.md_lime100,
                        R.color.md_lime200,
                        R.color.md_lime300,
                        R.color.md_lime400,
                        R.color.md_lime500,
                        R.color.md_lime600,
                        R.color.md_lime700,
                        R.color.md_lime800,
                        R.color.md_lime900,
                        R.color.md_limeA100,
                        R.color.md_limeA200,
                        R.color.md_limeA400,
                        R.color.md_limeA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_yellow50,
                        R.color.md_yellow100,
                        R.color.md_yellow200,
                        R.color.md_yellow300,
                        R.color.md_yellow400,
                        R.color.md_yellow500,
                        R.color.md_yellow600,
                        R.color.md_yellow700,
                        R.color.md_yellow800,
                        R.color.md_yellow900,
                        R.color.md_yellowA100,
                        R.color.md_yellowA200,
                        R.color.md_yellowA400,
                        R.color.md_yellowA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_amber50,
                        R.color.md_amber100,
                        R.color.md_amber200,
                        R.color.md_amber300,
                        R.color.md_amber400,
                        R.color.md_amber500,
                        R.color.md_amber600,
                        R.color.md_amber700,
                        R.color.md_amber800,
                        R.color.md_amber900,
                        R.color.md_amberA100,
                        R.color.md_amberA200,
                        R.color.md_amberA400,
                        R.color.md_amberA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_orange50,
                        R.color.md_orange100,
                        R.color.md_orange200,
                        R.color.md_orange300,
                        R.color.md_orange400,
                        R.color.md_orange500,
                        R.color.md_orange600,
                        R.color.md_orange700,
                        R.color.md_orange800,
                        R.color.md_orange900,
                        R.color.md_orangeA100,
                        R.color.md_orangeA200,
                        R.color.md_orangeA400,
                        R.color.md_orangeA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_deeporange50,
                        R.color.md_deeporange100,
                        R.color.md_deeporange200,
                        R.color.md_deeporange300,
                        R.color.md_deeporange400,
                        R.color.md_deeporange500,
                        R.color.md_deeporange600,
                        R.color.md_deeporange700,
                        R.color.md_deeporange800,
                        R.color.md_deeporange900,
                        R.color.md_deeporangeA100,
                        R.color.md_deeporangeA200,
                        R.color.md_deeporangeA400,
                        R.color.md_deeporangeA700
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_brown50,
                        R.color.md_brown100,
                        R.color.md_brown200,
                        R.color.md_brown300,
                        R.color.md_brown400,
                        R.color.md_brown500,
                        R.color.md_brown600,
                        R.color.md_brown700,
                        R.color.md_brown800,
                        R.color.md_brown900,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_grey50,
                        R.color.md_grey100,
                        R.color.md_grey200,
                        R.color.md_grey300,
                        R.color.md_grey400,
                        R.color.md_grey500,
                        R.color.md_grey600,
                        R.color.md_grey700,
                        R.color.md_grey800,
                        R.color.md_grey900,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white
                } ) );
        items.add( createColorItem(
                new int[]{
                        R.color.md_bluegrey50,
                        R.color.md_bluegrey100,
                        R.color.md_bluegrey200,
                        R.color.md_bluegrey300,
                        R.color.md_bluegrey400,
                        R.color.md_bluegrey500,
                        R.color.md_bluegrey600,
                        R.color.md_bluegrey700,
                        R.color.md_bluegrey800,
                        R.color.md_bluegrey900,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white
                } ) );

        items.add( createColorItem(
                new int[]{
                        R.color.md_white,
                        R.color.md_black,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white,
                        R.color.md_white
                } ) );
        items.add( createTopicItem( "Icon", MaterialColor.TEAL_500 ) );
        items.add( createIconItem() );
        items.add( createTopicItem( "Typography", MaterialColor.TEAL_500 ) );
        items.add( createTextItem() );
        items.add( createTopicItem( "Metrics & keylines size", MaterialColor.PINK_500 ) );
        items.add( createKeylinesItem() );
        items.add( createTopicItem( "Elevation", MaterialColor.CYAN_500 ) );
        items.add( createElevationItem() );

        return items;
    }

    private static BaseItem createIconItem(){
        return new IconItem();
    }


    private static TopicItem createTopicItem( String topic, @ColorInt int resId ){
        return new TopicItem( topic, resId );
    }

    private static ColorItem createColorItem( int[] colors ){
        return new ColorItem( colors );
    }

    private static TextItem createTextItem(){
        return new TextItem();
    }

    private static KeylinesItem createKeylinesItem(){
        return new KeylinesItem();
    }

    private static BaseItem createElevationItem(){
        return new ElevationItem();
    }
}
