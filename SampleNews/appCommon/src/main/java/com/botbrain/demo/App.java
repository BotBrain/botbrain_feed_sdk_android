package com.botbrain.demo;

import android.app.Application;

import com.botbrain.demo.listener.MyReadNewsActivityListener;
import com.botbrain.demo.listener.MySearchNewsActivityListener;

import ai.botbrain.ttcloud.api.TtCloudManager;
import ai.botbrain.ttcloud.api.TtcClient;

/**
 * Description：
 * Creator: Created by peter.
 * Date: 17/4/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TtcClient client = new TtcClient.Builder()
                .setLogEnable(true)
                .setReadNewsActivityListener(new MyReadNewsActivityListener())
                .setSearNewsActivityListener(new MySearchNewsActivityListener())
                .build();
        TtCloudManager.init(this, client);

        //TtCloudManager.init(this);
    }

}
