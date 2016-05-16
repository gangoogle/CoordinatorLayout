package com.google.coordinatorlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zgyi on 2016/3/28.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Integer>mData;
    private Context ctx;
    public RecyclerViewAdapter(Context ctx,ArrayList<Integer>mData) {
        super();
        this.ctx=ctx;
        this.mData=mData;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       holder.textView.setText(mData.get(position)+"!!");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view =View.inflate(ctx,R.layout.listview_item,null);
        ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
   public static class ViewHolder extends RecyclerView.ViewHolder{
       private TextView textView;

       public ViewHolder(View itemView) {
           super(itemView);
           textView=(TextView)itemView.findViewById(R.id.textview);
       }
   }

}
