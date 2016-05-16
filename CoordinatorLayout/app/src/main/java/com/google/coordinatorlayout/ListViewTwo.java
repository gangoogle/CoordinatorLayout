package com.google.coordinatorlayout;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by zgyi on 2016/3/28.
 */
public class ListViewTwo extends BaseView {
    private ArrayList<Integer> mData;
    private RecyclerView mRecyclerView;

    public ListViewTwo(Context ctx) {
        super(ctx);


    }

    @Override
    View initView() {
        View view = View.inflate(ctx, R.layout.listview_two, null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rcView);
        // 创建一个线性布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(ctx);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(layoutManager);
        mData = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            mData.add(i);
        }
        mRecyclerView.setAdapter(new RecyclerViewAdapter(ctx, mData));
        return view;
    }


}
