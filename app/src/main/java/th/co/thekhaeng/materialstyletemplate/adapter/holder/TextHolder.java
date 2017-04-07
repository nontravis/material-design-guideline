package th.co.thekhaeng.materialstyletemplate.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import th.co.thekhaeng.materialstyletemplate.R;
import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.item.TopicItem;


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

public class TextHolder extends BaseViewHolder{

    private TextView tvTopic;

    public TextHolder( ViewGroup viewGroup ){
        super( viewGroup, R.layout.holder_text );
    }

    @Override
    protected void bindView( View view ){
        tvTopic = (TextView) view.findViewById( R.id.tv_topic );
    }

    public void onBind( TopicItem item ){
        tvTopic.setText( item.getTopic() );
    }
}
