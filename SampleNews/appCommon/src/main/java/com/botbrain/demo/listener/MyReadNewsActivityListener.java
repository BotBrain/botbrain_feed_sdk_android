package com.botbrain.demo.listener;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.MenuItem;

import com.botbrain.demo.R;

import ai.botbrain.ttcloud.api.ReadNewsActivityListener;
import ai.botbrain.ttcloud.sdk.view.activity.ReadNewsActivity;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 2017/10/27.
 */

public class MyReadNewsActivityListener implements ReadNewsActivityListener {

    private static final String TAG = MyReadNewsActivityListener.class.getSimpleName();

    ReadNewsActivity mActivity;

    @Override
    public void getReadNewsActivity(ReadNewsActivity activity) {
        mActivity = activity;
        /** 设置导航栏背景颜色 */
        activity.setToolBarBackgroundColor(activity.getResources().getColor(R.color.color_e19797));
        /** 设置导航栏返回图标 **/
        activity.setToolBarNavigationIcon(R.drawable.ic_time_to_leave_black_24dp);
        /** 设置导航栏右侧菜单 **/
        //activity.setToolBarInflateMenu(R.menu.menu_tip);
        /** 设置导航栏标题颜色 **/
        activity.setToolBarTitleColor(activity.getResources().getColor(R.color.colorPrimary));
    }

    @Override
    public void onClickMenuItem(MenuItem item, String json) {
        Log.i(TAG, json);

        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setTitle("回调信息");
        builder.setMessage(json);
        builder.show();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreate()");
    }
}
