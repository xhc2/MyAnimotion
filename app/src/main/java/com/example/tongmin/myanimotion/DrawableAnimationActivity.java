package com.example.tongmin.myanimotion;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * 注意开始的地方rocketAnimation.start();
 * 为什么到时候去看官方网站。
 */
public class DrawableAnimationActivity extends AppCompatActivity {
    private AnimationDrawable rocketAnimation;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_drawable_animation);
        img = (ImageView) findViewById(R.id.img);
        img.setBackgroundResource(R.drawable.drawable_animation);
        rocketAnimation = (AnimationDrawable) img.getBackground();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rocketAnimation.start();
            }
        });
    }

}
