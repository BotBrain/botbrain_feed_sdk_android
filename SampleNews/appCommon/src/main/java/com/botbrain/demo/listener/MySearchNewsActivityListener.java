package com.botbrain.demo.listener;

import android.app.Activity;

import com.botbrain.demo.R;

import ai.botbrain.ttcloud.api.SearchNewsActivityListener;
import ai.botbrain.ttcloud.api.SearchNewsView;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 2017/10/30.
 */

public class MySearchNewsActivityListener implements SearchNewsActivityListener {

    @Override
    public void getSearchNewsView(Activity activity, SearchNewsView view) {
        // 这里定义搜索页面样式
        view.setToolBarNavigationIcon(R.drawable.ic_share_black_24dp);
    }
}
