package th.co.thekhaeng.materialstyletemplate.adapter.item;

import android.support.annotation.ColorInt;

import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseItem;

import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_TOPIC;

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

public class TopicItem extends BaseItem{
    private String topic;
    private int color;

    public TopicItem( String topic, @ColorInt int color ){
        super( TYPE_TOPIC );
        this.topic = topic;
        this.color = color;
    }

    public String getTopic(){
        return topic;
    }

    public int getColor(){
        return color;
    }
}
