package com.example.echarging.cityChoice.app;

import android.app.Application;

import com.example.echarging.cityChoice.utils.ScreenUtils;
import com.example.echarging.cityChoice.utils.ToastUtils;

/**
 * Created by fySpring
 * Date : 2017/10/9
 * To do :
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        ToastUtils.init(this);
        ScreenUtils.init(this);
    }
}
