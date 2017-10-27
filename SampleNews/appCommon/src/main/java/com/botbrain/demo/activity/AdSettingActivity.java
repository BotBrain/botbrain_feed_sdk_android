package com.botbrain.demo.activity;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.botbrain.demo.adapter.MyCustomHolder;
import com.botbrain.demo.R;

import java.util.List;

import ai.botbrain.ttcloud.sdk.callback.OnDynamicViewListener;
import ai.botbrain.ttcloud.sdk.model.RecommendEntity;
import ai.botbrain.ttcloud.sdk.view.fragment.IndexFragment;

/**
 * 开发者自行设置广告.
 */
public class AdSettingActivity extends AppCompatActivity implements OnDynamicViewListener {

    IndexFragment mNewsIndexFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_setting);
        mNewsIndexFragment = new IndexFragment();
        mNewsIndexFragment.setCustomHolder(new MyCustomHolder());
        mNewsIndexFragment.setOnRefreshListener(this);

        if (!mNewsIndexFragment.isAdded()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, mNewsIndexFragment);
            fragmentTransaction.commit();
        }

    }

    @Override
    public void onRefresh(int position, List<RecommendEntity.Data> datas) {
        //自由添加广告数据
        if (position == 1) {
            // 模拟请求接口的延迟
            SystemClock.sleep(3000);
            RecommendEntity.Data data = new RecommendEntity.Data();
            data.type = "customType";
            data.customContent = "指定内容";
            datas.add(0, data);
        }
    }
}
