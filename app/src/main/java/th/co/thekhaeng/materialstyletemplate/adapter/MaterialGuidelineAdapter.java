package th.co.thekhaeng.materialstyletemplate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseItem;
import th.co.thekhaeng.materialstyletemplate.adapter.base.BaseViewHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.holder.ColorPaletteHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.holder.ElevationHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.holder.IconHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.holder.KeylinesHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.holder.TextHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.holder.TopicHolder;
import th.co.thekhaeng.materialstyletemplate.adapter.item.ColorItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.ElevationItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.IconItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.KeylinesItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.TextItem;
import th.co.thekhaeng.materialstyletemplate.adapter.item.TopicItem;

import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_COLOR_PALETTE;
import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_ELEVATION;
import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_ICON;
import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_KEYLINES;
import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_TEXT;
import static th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator.TYPE_TOPIC;

/**
 * Created by thekhaeng on 4/7/2017 AD.
 */

public class MaterialGuidelineAdapter extends RecyclerView.Adapter<BaseViewHolder>{

    private List<BaseItem> itemList;

    public MaterialGuidelineAdapter( List<BaseItem> itemList ){
        this.itemList = itemList;
    }

    @Override
    public int getItemCount(){
        if( itemList == null ) return 0;
        return itemList.size();
    }

    @Override
    public int getItemViewType( int position ){
        return itemList.get( position ).getType();
    }

    @Override
    public BaseViewHolder onCreateViewHolder( ViewGroup parent, int viewType ){
        switch( viewType ){
            case TYPE_TOPIC:
                return new TopicHolder( parent );
            case TYPE_COLOR_PALETTE:
                return new ColorPaletteHolder( parent );
            case TYPE_ICON:
                return new IconHolder( parent );
            case TYPE_TEXT:
                return new TextHolder( parent );
            case TYPE_KEYLINES:
                return new KeylinesHolder( parent );
            case TYPE_ELEVATION:
                return new ElevationHolder( parent );
        }
        return null;
    }

    @Override
    public void onBindViewHolder( BaseViewHolder viewHolder, int position ){
        BaseItem baseItem = itemList.get( position );
        int type = getItemViewType( position );

        if( type == TYPE_TOPIC ){
            TopicHolder holder = (TopicHolder) viewHolder;
            TopicItem item = (TopicItem) baseItem;
            holder.onBind( item );
        }else if( type == TYPE_COLOR_PALETTE ){
            ColorPaletteHolder holder = (ColorPaletteHolder) viewHolder;
            ColorItem item = (ColorItem) baseItem;
            holder.onBind( item );
        }else if( type == TYPE_ICON ){
            IconHolder holder = (IconHolder) viewHolder;
            IconItem item = (IconItem) baseItem;
        }else if( type == TYPE_TEXT ){
            TextHolder holder = (TextHolder) viewHolder;
            TextItem item = (TextItem) baseItem;
        }else if( type == TYPE_KEYLINES ){
            KeylinesHolder holder = (KeylinesHolder) viewHolder;
            KeylinesItem item = (KeylinesItem) baseItem;
        }else if( type == TYPE_ELEVATION ){
            ElevationHolder holder = (ElevationHolder) viewHolder;
            ElevationItem item = (ElevationItem) baseItem;
        }
    }

}
