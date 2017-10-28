package com.botbrain.demo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.botbrain.demo.R;

import ai.botbrain.ttcloud.sdk.view.fragment.IndexFragment;

/**
 * 开发者自行设置广告.
 */
public class TabLayoutStyleActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    IndexFragment mNewsIndexFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout_style);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_style_tablayout);
        toolbar.setOnMenuItemClickListener(this);

        mNewsIndexFragment = new IndexFragment();

        if (!mNewsIndexFragment.isAdded()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, mNewsIndexFragment);
            fragmentTransaction.commit();
        }

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            /** 隐藏滑动标签控件 **/
            case R.id.item_hide:
                mNewsIndexFragment.hideTabLayout();
                break;
            /** 修改字体大小 */
            case R.id.item_size:
                mNewsIndexFragment.setTabTextSize(10, 20);
                break;
            /**设置颜色**/
            case R.id.item_color:
                mNewsIndexFragment.setTabTextColors(getResources().getColor(R.color.color_normal),
                        getResources().getColor(R.color.color_select));
                break;
            /**设置指示器高度***/
            case R.id.item_indicator_height:
                mNewsIndexFragment.setTabIndicatorHeight(0);
                break;
            /**设置滑动标签布局高度***/
            case R.id.item_layout_height:
                mNewsIndexFragment.setTabLayoutHeight(50);
                break;
            /**设置背景颜色**/
            case R.id.item_bg_color:
                mNewsIndexFragment.setTabBackground(getResources().getColor(R.color.color_e19797));
                break;
            /**设置间隔**/
            case R.id.item_space:
                mNewsIndexFragment.setTabSpace(10);
                break;
            /**设置指示器颜色**/
            case R.id.item_indicator_color:
                mNewsIndexFragment.setTabIndicatorColor(getResources().getColor(R.color.color_select));
                break;

        }
        return false;
    }
}
