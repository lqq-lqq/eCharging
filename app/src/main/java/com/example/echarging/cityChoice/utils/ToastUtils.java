package com.example.echarging.cityChoice.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fySpring
 * Date : 2017/4/6
 * To do :Toast工具类
 */

public class ToastUtils {
    private static Context sContext;
    private static Toast sToast;

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    public static void show(int resId) {
        show(sContext.getString(resId));
    }

    public static void show(String text) {
        if (sToast == null) {
            sToast = Toast.makeText(sContext, text, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(text);
        }
        sToast.show();
    }
}
