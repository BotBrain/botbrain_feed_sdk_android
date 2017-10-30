package com.botbrain.demo.listener;

import android.app.Activity;
import android.util.Log;

import com.botbrain.demo.R;

import ai.botbrain.ttcloud.api.SearchNewsActivityListener;
import ai.botbrain.ttcloud.api.SearchNewsView;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 2017/10/30.
 */

public class MySearchNewsActivityListener implements SearchNewsActivityListener {
    private static final String TAG = MyReadNewsActivityListener.class.getSimpleName();

    @Override
    public void getSearchNewsView(Activity activity, SearchNewsView view) {
        // 这里定义搜索页面样式
        view.setToolBarNavigationIcon(R.drawable.ic_share_black_24dp);
        view.setToolBarBackgroundColor(activity.getResources().getColor(R.color.colorPrimary));
    }

    /***********************************************/
    @Override
    public void onCreate(Activity activity) {
        Log.i(TAG, "onCreate()");
    }

    @Override
    public void onStart(Activity activity) {
        Log.i(TAG, "onStart()");
    }

    @Override
    public void onResume(Activity activity) {
        Log.i(TAG, "onResume()");
    }

    @Override
    public void onPause(Activity activity) {
        Log.i(TAG, "onPause()");
    }

    @Override
    public void onStop(Activity activity) {
        Log.i(TAG, "onStop()");
    }

    @Override
    public void onDestroy(Activity activity) {
        Log.i(TAG, "onDestroy()");
    }
}
