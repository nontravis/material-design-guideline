package th.co.thekhaeng.materialstyletemplate.adapter.item;

import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseItem;

import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_TOPIC;

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

public class TopicItem extends BaseItem{
    private String topic;

    public TopicItem( String topic ){
        super( TYPE_TOPIC );
        this.topic = topic;
    }

    public String getTopic(){
        return topic;
    }
}
