package com.as.demo_ok1;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import iammert.com.view.scalinglib.ScalingLayout;
import iammert.com.view.scalinglib.ScalingLayoutListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //因为它默认不是居中的  并且 左右俩边 都得有item 才会居中 设置Center
        CollapsingToolbarLayout toolbar_layout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
//        toolbar_layout.setCollapsedTitleGravity(Gravity.CENTER);
        toolbar_layout.setTitle("你大爷");
//        toolbar_layout.setExpandedTitleTextColor();//可以设置展开的 字的 颜色 和 收缩的字的颜色


        ScalingLayout scalingLayout = findViewById(R.id.scalingLayout);
        scalingLayout.setListener(new ScalingLayoutListener() {
            @Override
            public void onCollapsed() {

            }

            @Override
            public void onExpanded() {

            }

            @Override
            public void onProgress(float v) {

            }
        });

        View left = findViewById(R.id.left);
        View right = findViewById(R.id.right);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                Toast.makeText(MainActivity.this, "丢雷楼", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
