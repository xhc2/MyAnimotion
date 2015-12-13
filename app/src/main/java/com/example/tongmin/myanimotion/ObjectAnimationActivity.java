package com.example.tongmin.myanimotion;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ObjectAnimationActivity extends AppCompatActivity {

    SinView sinView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_object_animation);
        sinView = (SinView)findViewById(R.id.sinview);
        ValueAnimator sin = ObjectAnimator.ofInt(sinView,"offset",0,100);
        sin.setDuration(10000);
        sin.start();
    }

}
