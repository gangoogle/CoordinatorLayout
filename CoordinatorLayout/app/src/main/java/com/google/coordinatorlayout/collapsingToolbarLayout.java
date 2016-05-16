package com.google.coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class collapsingToolbarLayout extends AppCompatActivity {

    @Bind(R.id.dropImage)
    ImageView dropImage;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.cas_layout)
    CollapsingToolbarLayout casLayout;
    @Bind(R.id.appbar_layout)
    android.support.design.widget.AppBarLayout appbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
        ButterKnife.bind(this);
        toolbar.setTitle("Collapsing");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(collapsingToolbarLayout.this, "Navigation OnClick", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
