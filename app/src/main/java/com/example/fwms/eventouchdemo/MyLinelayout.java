package com.example.fwms.eventouchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by FWMS on 2017/6/5.
 */

public class MyLinelayout extends LinearLayout {
    private String TAG=this.getClass().getName();
    public MyLinelayout(Context context) {
        super(context);
    }

    public MyLinelayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinelayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        int action=event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN://按下
                Log.e(TAG,"dispatchTouchEvent----ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE://
                Log.e(TAG,"dispatchTouchEvent----ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP://
                Log.e(TAG,"dispatchTouchEvent----ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action=event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN://按下
                Log.e(TAG,"onTouchEvent----ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE://
                Log.e(TAG,"onTouchEvent----ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP://
                Log.e(TAG,"onTouchEvent----ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int action=event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN://按下
                Log.e(TAG,"onInterceptTouchEvent----ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE://
                Log.e(TAG,"onInterceptTouchEvent----ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP://
                Log.e(TAG,"onInterceptTouchEvent----ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Log.e(TAG,"requestDisallowInterceptTouchEvent");
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }
}
