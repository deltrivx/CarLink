package com.baidu.carlifevehicle;

import android.content.Context;
import android.content.res.Resources;

/**
 * 上游 CarLife 车辆端把 Context / Resources 放在 BaseActivity 的静态字段上，
 * 音频、工具类都从这里取 Application 上下文。我们不用原版 Activity（界面走
 * CarLink 那套），因此保留同样的静态入口，只把宿主换成我们自己的 Application。
 */
public final class BaseActivity {

    public static Resources mResource = null;
    public static Context mContext = null;

    private BaseActivity() {}

    /** 由 CarLink 的 Application / Activity 启动时调用一次。 */
    public static void bind(Context context) {
        if (context == null) return;
        Context app = context.getApplicationContext();
        mContext = app != null ? app : context;
        mResource = mContext.getResources();
    }
}
