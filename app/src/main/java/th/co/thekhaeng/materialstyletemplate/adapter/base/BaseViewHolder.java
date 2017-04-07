package th.co.thekhaeng.materialstyletemplate.adapter.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nonthawit on 7/30/2016.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder{

    public BaseViewHolder( ViewGroup parent, int layout ){
        super( LayoutInflater.from( parent.getContext() ).inflate( layout, parent, false ) );
        bindView( itemView );
    }


    protected abstract void bindView( View view );

    public Context getContext(){
        return itemView.getContext();
    }

}
