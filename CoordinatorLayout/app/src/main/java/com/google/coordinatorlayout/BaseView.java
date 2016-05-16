package com.google.coordinatorlayout;

import android.content.Context;
import android.view.View;

/**
 * Created by zgyi on 2016/3/28.
 */
public abstract class BaseView  {
     Context ctx;
    public BaseView(Context ctx)
    {
        this.ctx=ctx;
    }
    abstract View initView();
    public void Sys(){
        System.out.println("i'm father");
    }
}
