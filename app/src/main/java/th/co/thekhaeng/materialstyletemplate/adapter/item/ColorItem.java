package th.co.thekhaeng.materialstyletemplate.adapter.item;

import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseItem;

import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_COLOR_PALETTE;

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

public class ColorItem extends BaseItem{
    private int[] colors;

    public ColorItem( int[] colors){
        super( TYPE_COLOR_PALETTE );
        this.colors = colors;
    }

    public int[] getColors(){
        return colors;
    }
}
