package com.google.coordinatorlayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zgyi on 2016/3/28.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context ctx;
    private ArrayList<Integer> mData;

    public ListViewAdapter(Context ctx, ArrayList<Integer> mData) {
        this.ctx = ctx;
        this.mData = mData;
    }

    public ListViewAdapter() {
        super();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = View.inflate(ctx, R.layout.listview_item, null);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) convertView.findViewById(R.id.textview);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(mData.get(position) + "");
        return convertView;
    }

    private class ViewHolder {
        TextView textView;
    }
}

