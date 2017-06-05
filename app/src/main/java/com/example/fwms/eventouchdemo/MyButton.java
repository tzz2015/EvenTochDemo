package com.example.fwms.eventouchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by FWMS on 2017/6/5.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton {
    private String TAG=this.getClass().getName();
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
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

}
