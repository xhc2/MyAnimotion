package com.example.tongmin.myanimotion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent = new Intent();
    private Button btView, btLayoutAnimotion, btZhenDonghua, btPropertyAnimotion, btChazhiqi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);


        findViewById();
    }

    private void findViewById() {
        btView = (Button) findViewById(R.id.viewdonghua);
        btLayoutAnimotion = (Button) findViewById(R.id.layoutanimotion);
        btZhenDonghua = (Button) findViewById(R.id.zhendonghua);
        btPropertyAnimotion = (Button) findViewById(R.id.propertyanimotion);
        btChazhiqi = (Button) findViewById(R.id.chazhiqi);

        btView.setOnClickListener(this);
        btLayoutAnimotion.setOnClickListener(this);
        btZhenDonghua.setOnClickListener(this);
        btPropertyAnimotion.setOnClickListener(this);
        btChazhiqi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.viewdonghua:
                intent.setClass(MainActivity.this,ViewAnimotionActivity.class);
                startActivity(intent);
                break;
            case R.id.layoutanimotion:
                intent.setClass(MainActivity.this,LayoutAnimationActiivty.class);
                startActivity(intent);
                break;
            case R.id.zhendonghua:
                intent.setClass(MainActivity.this,DrawableAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.propertyanimotion:
                intent.setClass(MainActivity.this,ObjectAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.chazhiqi:
                break;

        }
    }
}
