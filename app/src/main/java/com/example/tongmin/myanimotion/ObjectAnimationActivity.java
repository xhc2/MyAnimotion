package com.example.tongmin.myanimotion;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ObjectAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Button valueJava, valueXml, ObjectJava, ObjectXml;
    int who = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_object_animation);
        valueJava = (Button) findViewById(R.id.valuejava);
        valueXml = (Button) findViewById(R.id.valuexml);
        ObjectJava = (Button) findViewById(R.id.objectjava);
        ObjectXml = (Button) findViewById(R.id.objectxml);

        valueJava.setOnClickListener(this);
        valueXml.setOnClickListener(this);
        ObjectJava.setOnClickListener(this);
        ObjectXml.setOnClickListener(this);

        intent = new Intent(this, ObjectAnimationActivity2.class);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.valuejava:
                who = 0;
                break;
            case R.id.valuexml:
                who = 1;
                break;
            case R.id.objectjava:
                who = 2;
                break;
            case R.id.objectxml:
                who = 3;
                break;
        }
        intent.putExtra("who",who);
        startActivity(intent);
    }
}
