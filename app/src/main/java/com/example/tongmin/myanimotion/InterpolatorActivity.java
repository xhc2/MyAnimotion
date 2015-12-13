package com.example.tongmin.myanimotion;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class InterpolatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btAccelerateDecelerateInterpolator, btAccelerateInterpolator, btAnticipateInterpolator, btAnticipateOvershootInterpolator;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. content_interpolator);
        btAccelerateDecelerateInterpolator = (Button)findViewById(R.id.AccelerateDecelerateInterpolator);
        btAccelerateInterpolator = (Button)findViewById(R.id.AccelerateInterpolator);
        btAnticipateInterpolator = (Button)findViewById(R.id.AnticipateInterpolator);
        btAnticipateOvershootInterpolator = (Button)findViewById(R.id.AnticipateOvershootInterpolator);


        btAccelerateDecelerateInterpolator.setOnClickListener(this);
        btAccelerateInterpolator.setOnClickListener(this);
        btAnticipateInterpolator.setOnClickListener(this);
        btAnticipateOvershootInterpolator.setOnClickListener(this);

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
                getTranslateFromJava(btAccelerateInterpolator, new AccelerateInterpolator());
                break;
            case R.id.AnticipateInterpolator:
                getTranslateFromJava(btAnticipateInterpolator, new AnticipateInterpolator());
                break;
            case R.id.AnticipateOvershootInterpolator:
                getTranslateFromJava(btAnticipateOvershootInterpolator, new AnticipateOvershootInterpolator());
                break;

        }
    }
}
