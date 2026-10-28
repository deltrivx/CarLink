package com.muyetuge.carlifevehicle.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import hc.c;
import i9.l;
import kotlin.Metadata;
import ob.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/muyetuge/carlifevehicle/receiver/BootBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BootBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "intent");
        Logger.INSTANCE.d("CarLife_Vehicle", a.q("【系统启动】", intent.getAction()));
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        c cVar = n8.c.f8897a;
        n8.c.d(new j8.a(2, null));
    }
}
