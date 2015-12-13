package com.example.tongmin.myanimotion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

/**
 * 动画中xml中的各个节点的意思
 * 常用的。
 */
public class ViewAnimotionActivity extends AppCompatActivity implements View.OnClickListener {

    private Button alpha, scale, translate, rotate, set,flag;
    private boolean xmlOrJava = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view_animotion);
        findViewById();
    }

    private void findViewById() {
        alpha = (Button) findViewById(R.id.alpha);
        scale = (Button) findViewById(R.id.scale);
        translate = (Button) findViewById(R.id.translate);
        rotate = (Button) findViewById(R.id.rotate);
        set = (Button) findViewById(R.id.set);
        flag = (Button) findViewById(R.id.flag);

        flag.setOnClickListener(this);
        scale.setOnClickListener(this);
        alpha.setOnClickListener(this);
        translate.setOnClickListener(this);
        set.setOnClickListener(this);
        rotate.setOnClickListener(this);
    }

    private void getAliphaAnimationFromJava() {
        AlphaAnimation alipha = new AlphaAnimation(0.0f, 1.0f);
        alipha.setDuration(1000);
        alpha.startAnimation(alipha);
    }

    private void getscaleAnimationFromJava(){
//        float fromX, float toX, float fromY, float toY,
//        float pivotX, float pivotY
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f,2f,0f,2f,0.5f,0.5f);
        scaleAnimation.setDuration(2000);
        scale.startAnimation(scaleAnimation);
    }


    private void getRotateFromJava(){
//        float fromDegrees, float toDegrees, int pivotXType, float pivotXValue,
//        int pivotYType, float pivotYValue
//        Animation.RELATIVE_TO_SELF 相对于自身0.5*自身的宽度就是中间，Animation.ABSOLUTE如果是0.5不再是中间，而是从左边开始的0.5个px。
        RotateAnimation rotateAnimation = new RotateAnimation(0f,-100f,Animation.ABSOLUTE,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(1000);
        rotate.startAnimation(rotateAnimation);
    }

    private void getSetAnimation(){
        AnimationSet animationSet = new AnimationSet(true);
        RotateAnimation rotateAnimation = new RotateAnimation(0f,-100f,Animation.ABSOLUTE,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(1000);
        TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,0f,
                Animation.RELATIVE_TO_PARENT,0.5f,
                Animation.RELATIVE_TO_PARENT,0f,
                Animation.RELATIVE_TO_PARENT,0.5f
        );
        translateAnimation.setDuration(2000);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        set.startAnimation(animationSet);
    }

   private void getTranslateFromJava(){
//       int fromXType, float fromXValue, int toXType, float toXValue,
//       int fromYType, float fromYValue, int toYType, float toYValue
       TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT,0f,
               Animation.RELATIVE_TO_PARENT,0.5f,
               Animation.RELATIVE_TO_PARENT,0f,
               Animation.RELATIVE_TO_PARENT,0.5f
               );
       translateAnimation.setDuration(2000);
       translate.startAnimation(translateAnimation);
   }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alpha:
                if (xmlOrJava) {
                    Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
                    alpha.startAnimation(alphaAnimation);
                } else {
                    getAliphaAnimationFromJava();
                }


                break;
            case R.id.scale:
                if (xmlOrJava) {
                    Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
                    scale.startAnimation(scaleAnimation);
                } else {
                    getscaleAnimationFromJava();
                }

                break;
            case R.id.translate:
                if (xmlOrJava) {
                    Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
                    translate.startAnimation(translateAnimation);
                } else {
                    getTranslateFromJava();
                }

                break;
            case R.id.rotate:
                if (xmlOrJava) {
                    Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
                    rotate.startAnimation(rotateAnimation);
                } else {
                    getRotateFromJava();
                }

                break;
            case R.id.set:
                if (xmlOrJava) {
                    Animation allAnimation = AnimationUtils.loadAnimation(this, R.anim.all_anim);
                    set.startAnimation(allAnimation);
                } else {
                    getSetAnimation();
                }

                break;
            case R.id.flag:
                xmlOrJava = xmlOrJava ? false : true;
                break;
        }
    }
}
