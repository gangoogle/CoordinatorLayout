package com.google.coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AppBarLayout extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tabs)
    TabLayout mTabs;
    @Bind(R.id.appbar_layout)
    android.support.design.widget.AppBarLayout mAppbarLayout;
    @Bind(R.id.viewpager)
    ViewPager mViewpager;
    private ArrayList<BaseView>mViews;
    private final String[] mTabStr={"One","Two"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);
        ButterKnife.bind(this);
        mViews=new ArrayList<>();
        mViews.add(new ListViewOne(this));
        mViews.add(new ListViewTwo(this));
        mToolbar.setTitle("ToolBar");
        mViewpager.setAdapter(new ViewPagerApdpter());
        mTabs.setTabMode(TabLayout.MODE_FIXED);
        mTabs.setupWithViewPager(mViewpager);

    }

    class ViewPagerApdpter extends PagerAdapter{
        @Override
        public int getCount() {
            return mViews.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            System.out.println("initview"+position);
            View view =mViews.get(position).initView();
            container.addView(view);
            return  view;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View)object);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabStr[position];
        }
    }
}
