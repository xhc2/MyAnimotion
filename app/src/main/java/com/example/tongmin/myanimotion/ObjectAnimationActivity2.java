package com.example.tongmin.myanimotion;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ObjectAnimationActivity2 extends AppCompatActivity {
    SinView sinView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation2);
        sinView = (SinView)findViewById(R.id.sinview);
        int who = getIntent().getIntExtra("who",0);
        switch (who){
            case 0:
                valueJava();
               break;
            case 1:
                valueXml();
                break;
            case 2:
                objectJava();
                break;
            case 3:
                objectXml();
                break;
        }


//        sinView = (SinView)findViewById(R.id.sinview);
//        ValueAnimator sin = ObjectAnimator.ofInt(sinView, "offset", 0, 50);
//        sin.setDuration(10000);
//        sin.start();
    }


    private void objectJava(){
        Toast.makeText(this,"load from objectjava",Toast.LENGTH_SHORT).show();
        ObjectAnimator sin = ObjectAnimator.ofInt(sinView, "offset", 0, 50);
        sin.setDuration(10000);

        sin.start();

    }

    private void objectXml(){
        Toast.makeText(this,"load from objectxml",Toast.LENGTH_SHORT).show();
        ObjectAnimator oa =  (ObjectAnimator) AnimatorInflater
                .loadAnimator(this, R.animator.objectxml);
        oa.setTarget(sinView);
        oa.start();
    }

    private void valueJava(){
        Toast.makeText(this,"load from valueJava",Toast.LENGTH_SHORT).show();
        ValueAnimator value = ValueAnimator.ofInt(0,10);
        value.setDuration(10000);
        value.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (Integer) animation.getAnimatedValue();
                sinView.setOffset(currentValue);

            }
        });
        value.start();

    }

    private void valueXml(){
        ValueAnimator va =  (ValueAnimator) AnimatorInflater
                .loadAnimator(this, R.animator.valuexml);
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (Integer) animation.getAnimatedValue();
                sinView.setOffset(currentValue);

            }
        });
        va.start();
    }
}
