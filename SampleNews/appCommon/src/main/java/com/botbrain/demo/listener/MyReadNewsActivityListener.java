package com.botbrain.demo.listener;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.MenuItem;

import com.botbrain.demo.R;

import ai.botbrain.ttcloud.api.ReadNewsActivityListener;
import ai.botbrain.ttcloud.api.ReadNewsView;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 2017/10/27.
 */

public class MyReadNewsActivityListener implements ReadNewsActivityListener {

    private static final String TAG = MyReadNewsActivityListener.class.getSimpleName();

    private Activity mActivity;

    @Override
    public void getReadNewsView(Activity activity, ReadNewsView view) {
        mActivity = activity;
        /** 设置导航栏背景颜色 */
        view.setToolBarBackgroundColor(activity.getResources().getColor(R.color.color_e19797));
        /** 设置导航栏返回图标 **/
        //view.setToolBarNavigationIcon(R.drawable.ic_time_to_leave_black_24dp);
        /** 设置导航栏右侧菜单 **/
        //activity.setToolBarInflateMenu(R.menu.menu_tip);
        /** 设置导航栏标题颜色 **/
        view.setToolBarTitleColor(activity.getResources().getColor(R.color.colorPrimary));
        /** 隐藏底部评论框 **/
        //view.hideComment();
        /** 设置分享icon **/
        //view.setShareImageRes(R.drawable.ic_share_black_24dp);
        /** 设置点赞的icon **/
        //view.setLikeImageRes(R.drawable.ic_thumb_up_black_24dp, R.drawable.ic_thumb_up_red_24dp);
    }

    @Override
    public void onClickMenuItem(MenuItem item, String json) {
        Log.i(TAG, json);

        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setTitle("回调信息(onClickMenuItem)");
        builder.setMessage(json);
        builder.show();
    }

    @Override
    public void onClickShare(String json) {
        Log.i(TAG, json);

        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setTitle("回调信息(onClickShare)");
        builder.setMessage(json);
        builder.show();
    }

    @Override
    public void onClickLike(String json) {
        Log.i(TAG, json);

        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setTitle("回调信息(onClickLike)");
        builder.setMessage(json);
        builder.show();
    }

    @Override
    public void onComment(String json) {
        Log.i(TAG, json);
        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setTitle("回调信息(onComment)");
        builder.setMessage(json);
        builder.show();
    }

    /********************************* 生命周期回调 ************************************/
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
