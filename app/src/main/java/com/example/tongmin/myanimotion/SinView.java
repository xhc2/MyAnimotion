package com.example.tongmin.myanimotion;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xhc on 2015/12/13.
 */
public class SinView extends View {

    private Paint paint;
    private Paint mPaint;
    private float r = 100;
    private int circleX = 300,circleY = 300;
    //sin图形开始的点
    private float startPointX = circleX - r , startPointY = circleY ;
    private int offset = 0;
    //保存的点，偶数点时x，奇数点时y
    private float[] points = new float[200];
    public SinView(Context context) {
        super(context);
        init(context);
    }

    public SinView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
        getPoint();
    }

    public SinView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#0909FF"));
        paint.setAntiAlias(true);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.parseColor("#ffffff"));
        mPaint.setAntiAlias(true);
        getPoint();
    }

    //获取坐标系中的坐标
    private void getPoint(){
        for(int i = 0 ;i < 200 ; i += 2){
           int newX = i;

            float temp = (float) Math.sin(offset+(Math.PI / 200)*i)*70;

            points[i] =startPointX+newX;
            points[i+1] = startPointY + temp;
        }
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(circleX,circleY,r,paint);

        for(int i = 0 ; i < 200 ; i+=2){
            if(i < 198){
                canvas.drawLine(points[i],points[i+1],points[i+2],points[i+3],mPaint);
            }

        }

    }
}














