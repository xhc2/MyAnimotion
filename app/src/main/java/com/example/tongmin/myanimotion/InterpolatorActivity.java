package com.example.tongmin.myanimotion;

import android.os.Bundle;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;


public class InterpolatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btAccelerateDecelerateInterpolator, btAccelerateInterpolator,
            btAnticipateInterpolator, btAnticipateOvershootInterpolator,
            btBounceInterpolator, btCycleInterpolator,
            btDecelerateInterpolator, btFastOutLinearInInterpolator,
            btLinearInterpolator, btLinearOutSlowInInterpolator,
            btOvershootInterpolator, btPathInterpolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_interpolator);
        btAccelerateDecelerateInterpolator = (Button) findViewById(R.id.AccelerateDecelerateInterpolator);
        btAccelerateInterpolator = (Button) findViewById(R.id.AccelerateInterpolator);
        btAnticipateInterpolator = (Button) findViewById(R.id.AnticipateInterpolator);
        btAnticipateOvershootInterpolator = (Button) findViewById(R.id.AnticipateOvershootInterpolator);
        btBounceInterpolator = (Button) findViewById(R.id.BounceInterpolator);
        btCycleInterpolator = (Button) findViewById(R.id.CycleInterpolator);
        btDecelerateInterpolator = (Button) findViewById(R.id.DecelerateInterpolator);
        btFastOutLinearInInterpolator = (Button) findViewById(R.id.FastOutLinearInInterpolator);
        btLinearInterpolator = (Button) findViewById(R.id.LinearInterpolator);
        btLinearOutSlowInInterpolator = (Button) findViewById(R.id.LinearOutSlowInInterpolator);
        btOvershootInterpolator = (Button) findViewById(R.id.OvershootInterpolator);
        btPathInterpolator = (Button) findViewById(R.id.PathInterpolator);

        btPathInterpolator.setOnClickListener(this);
        btOvershootInterpolator.setOnClickListener(this);
        btLinearOutSlowInInterpolator.setOnClickListener(this);
        btLinearInterpolator.setOnClickListener(this);
        btAccelerateDecelerateInterpolator.setOnClickListener(this);
        btDecelerateInterpolator.setOnClickListener(this);
        btCycleInterpolator.setOnClickListener(this);
        btAccelerateInterpolator.setOnClickListener(this);
        btBounceInterpolator.setOnClickListener(this);
        btAnticipateInterpolator.setOnClickListener(this);
        btAnticipateOvershootInterpolator.setOnClickListener(this);
        btFastOutLinearInInterpolator.setOnClickListener(this);

    }

    private void getTranslateFromJava(View view, Interpolator interpolator) {
        TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, 0.5f,
                Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, 0.5f
        );
        translateAnimation.setDuration(2000);
        translateAnimation.setInterpolator(interpolator);
        view.startAnimation(translateAnimation);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.AccelerateDecelerateInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new AccelerateDecelerateInterpolator());
                break;
            case R.id.AccelerateInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new AccelerateInterpolator());
                break;
            case R.id.AnticipateInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new AnticipateInterpolator());
                break;
            case R.id.AnticipateOvershootInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new AnticipateOvershootInterpolator());
                break;
            case R.id.BounceInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new BounceInterpolator());
                break;
            case R.id.CycleInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new CycleInterpolator(5f));
                break;
            case R.id.DecelerateInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new DecelerateInterpolator());
                break;
            case R.id.FastOutLinearInInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new FastOutLinearInInterpolator());
                break;
            case R.id.LinearInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new LinearInterpolator());
                break;
            case R.id.LinearOutSlowInInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new LinearOutSlowInInterpolator());
                break;
            case R.id.OvershootInterpolator:
                getTranslateFromJava(btAccelerateDecelerateInterpolator, new OvershootInterpolator());
                break;
            case R.id.PathInterpolator:
//                getTranslateFromJava(btPathInterpolator, new PathInterpolator(0f, 0f, 100f, 100f));
                break;

        }
    }
}
