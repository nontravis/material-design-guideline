package th.co.thekhaeng.materialstyletemplate.adapter.holder;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import th.co.thekhaeng.materialstyletemplate.R;
import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.item.ColorItem;


/**
 * Created by thekhaeng on 4/6/2017 AD.
 */

public class ColorPaletteHolder extends BaseViewHolder{


    private List<View> colorViews;

    public ColorPaletteHolder( ViewGroup viewGroup ){
        super( viewGroup, R.layout.holder_color_palette );
    }

    @Override
    protected void bindView( View view ){
        colorViews = new ArrayList<>();
        colorViews.add( view.findViewById( R.id.md_color_50 ) );
        colorViews.add( view.findViewById( R.id.md_color_100 ) );
        colorViews.add( view.findViewById( R.id.md_color_200 ) );
        colorViews.add( view.findViewById( R.id.md_color_300 ) );
        colorViews.add( view.findViewById( R.id.md_color_400 ) );
        colorViews.add( view.findViewById( R.id.md_color_500 ) );
        colorViews.add( view.findViewById( R.id.md_color_600 ) );
        colorViews.add( view.findViewById( R.id.md_color_700 ) );
        colorViews.add( view.findViewById( R.id.md_color_800 ) );
        colorViews.add( view.findViewById( R.id.md_color_900 ) );
        colorViews.add( view.findViewById( R.id.md_color_a100 ) );
        colorViews.add( view.findViewById( R.id.md_color_a200 ) );
        colorViews.add( view.findViewById( R.id.md_color_a400 ) );
        colorViews.add( view.findViewById( R.id.md_color_a700 ) );
    }

    public void onBind( ColorItem item ){
        if( item.getColors() == null ) return;
        for( int i = 0; i < colorViews.size(); i++ ){
            int resId = item.getColors()[i];
            if( resId != 0 ){
                colorViews.get( i ).setBackgroundResource( resId );
            }
        }
    }
}
