package com.google.coordinatorlayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by zgyi on 2016/3/28.
 */
public class ListViewOne extends BaseView {

    private ArrayList<Integer> mData;
    private RecyclerView mRecyclerView;

    public ListViewOne(Context ctx) {
        super(ctx);


    }

    @Override
    View initView() {
        View view = View.inflate(ctx, R.layout.listview_one, null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rcView);
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx, collapsingToolbarLayout.class);
                ctx.startActivity(intent);
            }
        });
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
